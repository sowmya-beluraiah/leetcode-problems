class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int max=0;
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0 && k>0){
                nums[i] = -nums[i];
                k--;
            }
        }
        
        if(k > 0 && k%2 != 0) {
            Arrays.sort(nums);
            nums[0] = -nums[0];
        }
            
        for(int n : nums)
            max += n;
        
        return max;
    }
}