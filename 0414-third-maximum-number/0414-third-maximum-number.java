class Solution {
    public int thirdMax(int[] nums) {
        long f= Long.MIN_VALUE;
        long s= Long.MIN_VALUE;
        long t= Long.MIN_VALUE;
        for (int num: nums) {
            if (num > f) {
                f = num;
            }
        }

        // Find second max (distinct)
        for (int num : nums) {
            if (num < f && num > s) {
                s = num;
            }
        }

        // Find third max (distinct)
        for (int num : nums) {
            if (num < s && num > t) {
                t = num;
            }
        }

        // If third doesn't exist
        if (t == Long.MIN_VALUE) {
            return (int) f;
        }

        return (int) t;
    }
}