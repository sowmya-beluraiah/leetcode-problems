class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String[] input = s.split(" ", -1);
        
        for(int i=input.length-1; i>=0; i--){
            if(!input[i].equals("")){
                res.append(input[i]);
                res.append(" ");
            }
        }
        
        return res.toString().trim();
    }
}