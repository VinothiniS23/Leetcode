class Solution {
    public int thirdMax(int[] nums) {
        long f= Long.MIN_VALUE;
        long s= Long.MIN_VALUE;
        long t= Long.MIN_VALUE;
        for (int num:nums) {
            if (num>f) {
                f= num;
            }
        }
        for (int num:nums) {
   if (num<f && num>s) {
                s= num;
            }
        }
        for (int num:nums) {
              if (num<s && num>t) {
                = num;
               }
        }
        if (t==Long.MIN_VALUE) {
              return (int)f;
        }
        return (int)t;
    }
}