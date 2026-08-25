class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] newNums = new int[size*2];
        int j = size;

        for(int i = 0; i<size; i++){
            newNums[i]=nums[i];
            newNums[j]=nums[i];
            j++;
        }
        return newNums;
    }
}