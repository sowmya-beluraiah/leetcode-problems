class Solution {
    public int findShortestSubArray(int[] nums) {
        int max=1, size=1;
        HashMap<Integer, List<Integer>> store= new HashMap();
        List<Integer> temp;
            
        for(int i=0; i<nums.length; i++){
            if(store.containsKey(nums[i])) {
                temp = store.get(nums[i]);
                int count = temp.get(0)+1;
                int ar_length = (i - temp.get(1))+1;
                if(max < count){
                    max = count;
                    size = ar_length;
                } else if(max == count && size > ar_length) {
                    size = ar_length;
                }
                temp.set(0, count);
            } else {
                temp = new ArrayList();
                temp.add(1);
                temp.add(i);
            }
            
            
            store.put(nums[i], temp);
        }
        
        return size;
    }
}