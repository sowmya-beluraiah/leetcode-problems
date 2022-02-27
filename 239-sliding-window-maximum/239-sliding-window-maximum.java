class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int size = nums.length - (k-1);
        int[] res = new int[size];
        Deque<Integer> q = new ArrayDeque<>();
        
        for(int i=0; i<k; i++){
            while(!q.isEmpty() && q.peekLast() < nums[i]){
                q.pollLast();
            }
            q.addLast(nums[i]);
        }
        
        
            
       
        
        int j=0;
        for(int i=k; i<nums.length; i++){
            res[j++] = q.peekFirst();
            if(q.peekFirst() == nums[i-k]){
               q.pollFirst(); 
            } 
            
            while(!q.isEmpty() && q.peekLast() < nums[i]){
                q.pollLast();
            }
            q.addLast(nums[i]);
            
        }
        
        res[j] = q.peekFirst();
        return res;
    }
}