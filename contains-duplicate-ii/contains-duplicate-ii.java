class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, List<Integer>> store  = new HashMap();
        
        List<Integer> temp;
        for(int i=0; i<nums.length; i++){
            if(store.containsKey(nums[i]))
                temp = store.get(nums[i]);
            else
                temp = new ArrayList();
            
            for(int j : temp){
                System.out.println(i + " " + j);
                if(Math.abs(i-j) <= k)
                    return true;
            }
            
            temp.add(i);
            store.put(nums[i], temp);
        }
        
        return false;
    }
}