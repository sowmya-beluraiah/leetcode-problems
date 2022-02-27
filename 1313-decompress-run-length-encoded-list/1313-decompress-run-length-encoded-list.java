class Solution {
    public int[] decompressRLElist(int[] nums) {
        int f,v;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<nums.length-1; i+=2){
            f = nums[i];
            v = nums[i+1];
            while(f-- > 0){
                list.add(v);
            }
        }
        
        int[] res = list.stream().mapToInt(i -> i).toArray();
        
        return res;
    }
}