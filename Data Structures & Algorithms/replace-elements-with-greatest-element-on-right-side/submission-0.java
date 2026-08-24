class Solution {
    public int[] replaceElements(int[] arr) {
        int k = 0;
        int last = arr.length - 1;

        while (k < last) {
            int max = -1;
            for (int i = last; i > k; i--) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            arr[k] = max;
            k++;
        }

        arr[last] = -1;
        return arr;
    }
}