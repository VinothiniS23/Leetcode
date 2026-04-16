class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase();
      
        String res= "";
        for(int i=0; i<s.length(); i++) {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)) {
                res= res+ ch;
            }
        }
        
        String rev= "";
        for(int i=res.length()-1; i>= 0; i--) {
            rev= rev+res.charAt(i);
        }
        
        
        if(res.equals(rev)) {
           return true;
        } else {
            return false;
        }
        
    }
}