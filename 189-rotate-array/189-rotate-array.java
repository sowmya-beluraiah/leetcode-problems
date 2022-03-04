class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        
        
        rotateFun(nums, 0, len-k-1);
        rotateFun(nums, len-k, len-1);
        rotateFun(nums, 0, len-1);
        
    }
    
    public void rotateFun(int[] nums, int start, int end) {
        int temp;
        while(start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++; end--;
        }
    }
}