class Solution {
    public int pivotIndex(int[] nums) {
       int ts = 0;
        for (int n : nums) {
        ts += n;
        }
        int lSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rSum = ts - lSum - nums[i];
         if (lSum == rSum) {
                  return i; 
            }
            
          lSum += nums[i];
        }
        
        return -1; 
    }
}