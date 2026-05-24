class Solution {
    public boolean isHappy(int n) {
        int s=0;
        if(n==1||n==7){
            return true;
        }
        while(n>=10){
 s=0;
//int sq=0;
while(n>0){
    int r=n%10;

s+=r*r;
n=n/10;
}
n=s;

        }
        if(s==1||s==7){
           return true; 
        }else{
            return false;
        }
    }
}