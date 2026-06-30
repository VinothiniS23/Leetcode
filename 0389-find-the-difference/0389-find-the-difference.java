class Solution {
    public char findTheDifference(String s, String t) {
        int a[]=new int[26];
      for(char c:s.toCharArray()){
            a[c-'a']++;
        }
        for(char c:t.toCharArray()){
            a[c-'a']--;
            if(a[c-'a']<0){
                return c;
            }
        }
        return ' ';
    }
}