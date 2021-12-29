class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] res = new int[k];
        int[] temp = nums.clone();
        HashMap<Integer, Integer> store = new HashMap();
        
        Arrays.sort(nums);
        
        for(int i=nums.length-1; i>=nums.length-k; i--){
            store.put(nums[i], store.getOrDefault(nums[i],0)+1);
        }
        
        int j=0;
        for(int i=0; i<temp.length; i++){
            if(store.containsKey(temp[i]) && store.get(temp[i])!=0){
                res[j++] = temp[i];
                store.put(temp[i], store.get(temp[i])-1);
            }
        }
        
        return res;
        
    }
}