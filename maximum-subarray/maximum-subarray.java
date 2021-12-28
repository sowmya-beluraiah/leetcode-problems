class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int temp=0;
        
        for(int n : nums){
            temp += n;
            max = temp > max ? temp : max;
            if(temp < 0)
                temp=0;
        }
        
        return max;
    }
}