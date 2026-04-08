class Solution {
    public int majorityElement(int[] nums) {
       Arrays.sort(nums);
        int k = nums.length;
        return nums[k/2];
        
    }
}