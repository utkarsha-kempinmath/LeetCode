class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int[] diff = new int[n];

        for (int i = 0; i < n; i++) {
            diff[i] = arr[i] - 1 - i;
        }

        if (k <= diff[0]) {
            return k;
        }

        int s = 0;
        int e = n - 1;
        int temp = -1; 

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (diff[m] < k) {
                temp = m;
                s = m + 1;
            } else {
                e = m - 1;
            }
        }

        return arr[temp] + (k - diff[temp]);
    }
}