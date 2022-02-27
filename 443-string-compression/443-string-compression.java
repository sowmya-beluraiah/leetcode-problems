class Solution {
    public int compress(char[] chars) {
        int idx = 0;
        char prev = chars[0];
        int count = 1;
        StringBuilder res = new StringBuilder();
        
        for(int i=1; i<chars.length; i++){
            if(chars[i] == prev){
                count++;
            } else {
                res.append(String.valueOf(prev));
                if(count > 1)
                    res.append(String.valueOf(count));
                prev = chars[i];
                count = 1;
            }
            
        }
        
        res.append(String.valueOf(prev));
        if(count > 1)
            res.append(String.valueOf(count));
        
        
        for(char c : res.toString().toCharArray())
            chars[idx++] = c;
        return idx;
    }
}