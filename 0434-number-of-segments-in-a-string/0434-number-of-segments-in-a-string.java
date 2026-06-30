class Solution {
    public int countSegments(String s) {
        s=s.trim();
       String w[]=s.split(" ");
   int c=0;
   for(int i=0;i<w.length;i++){
    if(!w[i].equals("")){
        c++;
    }
   }
return c;
    }
}