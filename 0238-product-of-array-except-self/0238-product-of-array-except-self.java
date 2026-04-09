class Solution {
    public int[] productExceptSelf(int[] nums) {
      int l = nums.length;
        int[] arr = new int[l];
        arr[0] = 1;
        for (int i = 1; i < l; i++) {
                arr[i] = arr[i - 1] * nums[i - 1];
        }

       
 int sfx = 1;
        for (int i = l - 1; i >= 0; i--) {
            arr[i] = arr[i] * sfx;
            sfx =sfx* nums[i];
        }

        return arr;  
    }
}