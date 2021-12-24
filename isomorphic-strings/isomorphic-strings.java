class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        HashMap<Character, Character> sToT = new HashMap<>();
        HashSet<Character> tToS = new HashSet<>();
        
        for(int i=0; i<s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if(sToT.containsKey(c1)) {
                if(sToT.get(c1) != c2) return false;
            } else {
                if(tToS.contains(c2)) return false; 
            } 
          
            sToT.put(c1, c2);
            tToS.add(c2);
        }
        
        return true;
    }
}