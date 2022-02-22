class Solution {
    public int removeDuplicates(int[] nums) {
        int idx=1;
        int max=1;
        
        for(int i=1; i<nums.length; i++){

            if(nums[i] != nums[i-1]){
                nums[idx++] = nums[i];
                max=1;
            } else {
                if(max < 2){
                    max++;
                    nums[idx++] = nums[i];
                }
            } 
            
        }
        
        return idx;
    }
}