class Solution {
    public String countAndSay(int n) {
        return countRecursive(n);
    }
    
    public String countRecursive(int finalN){
        if(finalN == 1){
            return "1";
        }
        
        String prev = countRecursive(finalN-1);
        
        StringBuilder res = new StringBuilder();
        int count = 1;
        char p = prev.charAt(0);
        for(int i=1; i<prev.length(); i++){
            if(prev.charAt(i) == p){
                count++;
            } else {
                res.append(String.valueOf(count));
                res.append(String.valueOf(p));
                p = prev.charAt(i);
                count = 1;
            }
        }
        res.append(String.valueOf(count));
        res.append(String.valueOf(p));
        
        return res.toString();
    }
}