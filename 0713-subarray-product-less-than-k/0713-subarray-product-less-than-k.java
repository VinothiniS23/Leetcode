class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
       
        int c=0;
        for(int we=0;we<nums.length;we++)
        {
             int p=1;
           for(int j=we;j<nums.length;j++)
           {
            
            p=p*nums[j];
              if (p < k) {
                    c++;
                } else {
                    break;
                }
           }

            }
        
        return c;
    }
}