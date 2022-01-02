class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> maxSet  = new TreeSet<>(Collections.reverseOrder());
        
        for(int n : nums)
            maxSet.add(n);
        
        int k=1, temp=0;
        for(int s : maxSet){
            if(k == 1)
                temp = s;
            if(k == 3)
                return s;
            k++;
        }
        
        return temp;
    }
}