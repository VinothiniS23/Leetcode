class Solution {
    public String longestCommonPrefix(String[] strs) {
         String result="";
        int i=0;
        while(true){
            if (i>=strs[0].length())
     break;
 char ch=strs[0].charAt(i);

            for (int j=1; j<strs.length; j++) {
                if (i>=strs[j].length() || strs[j].charAt(i) != ch) {
                    return result;
                }
            }

            result=result+ ch;
            i++;
        }

        return result;
    }
}