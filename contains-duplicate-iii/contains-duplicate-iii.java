class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        HashMap<Long, Long> store = new HashMap();
        long w_size = t+1;
        
        for(int i=0; i<nums.length; i++){
            long key = getKey(nums[i], w_size);
            
            if(store.containsKey(key))
                return true;
            
            if(store.containsKey(key-1) && Math.abs(store.get(key-1)-nums[i])<=t)
                return true;
            
            if(store.containsKey(key+1) && Math.abs(store.get(key+1)-nums[i])<=t)
                return true;
            
            store.put(key, (long)nums[i]);
            
            if(i>=k)
                store.remove(getKey(nums[i-k],w_size));
        }
        
        return false;
    }
    
    public long getKey(long x, long w){
        return x<0 ? (x+1)/w-1 : x/w;
    }
}