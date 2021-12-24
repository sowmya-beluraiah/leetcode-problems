class Solution {
    public boolean checkPalindromeFormation(String a, String b) {        
        if(isSplitPalindrome(a,b) || isSplitPalindrome(b,a))
            return true;
        
        return false;
    }
    
    public boolean isSplitPalindrome(String a, String b){
        int count=0;
        
        int  i=0, j=a.length()-1;
        while(i<j && a.charAt(i) == b.charAt(j)){
            i++; j--;
        }
        
        if(i > j)
            return true;
        
        return isPalindrome(a.substring(i, j+1)) || isPalindrome(b.substring(i, j+1));
    }
    
    public boolean isPalindrome(String s){
        for(int i=0,j=s.length()-1; i<j; i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}