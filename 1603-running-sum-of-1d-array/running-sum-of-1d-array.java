class Solution {
    public int[] runningSum(int[] arr) {

        int n = arr.length;

        int[] arr1 = new int[n];

        arr1[0] = arr[0];

        for (int i = 1; i < n; i++) {
            arr1[i] = arr[i] + arr1[i - 1];
        }

        return arr1;
    }
}