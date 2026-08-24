class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        int num = 0;
        int max = 0;

        for (int i = 0; i < len; i++) {
            if (nums[i] == 1) {
                num++;
            } else {
                num = 0;
            }
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
}