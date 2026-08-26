class Solution {
    public int calPoints(String[] operations) {
        int arr[] = new int[operations.length];
        int sum = 0;
        int current = 0;

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("+")) {
                arr[current] = arr[current - 1] + arr[current - 2];
                sum += arr[current];
                current++;

            } else if (operations[i].equals("C")) {
                sum -= arr[current-1];
                current--;

            } else if (operations[i].equals("D")) {
                arr[current] = arr[current-1] * 2;
                sum += arr[current];
                current++;

            } else {
                arr[current] = Integer.parseInt(operations[i]);
                sum += arr[current];
                current++;
            }
        }
        return sum;
    }
}