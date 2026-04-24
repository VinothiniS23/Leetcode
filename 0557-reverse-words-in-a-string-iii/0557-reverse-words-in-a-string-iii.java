class Solution {
    public String reverseWords(String s) {
       String r="";
String w[]=s.split(" ");
for(int i=0;i<w.length;i++){
    char ch[]=w[i].toCharArray();
    for(int j=ch.length-1;j>=0;j--){
        r+=ch[j];
    }
    if(i!=w.length-1)
    r+=" ";
    
}
return r;
    }
}