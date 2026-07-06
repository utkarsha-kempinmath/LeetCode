class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = i + 1;
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        return comb(arr, 0, k, n, ans, current);
    }

    public static List<List<Integer>> comb(int[] arr, int i, int k, int n, List<List<Integer>> ans,
            List<Integer> current) {
        if (i == arr.length || current.size() > k) {
            return ans;
        }
        current.add(arr[i]);

        if (current.size() == k) {
            int sum = 0;
            for (int num : current) {
                sum += num;
            }
            if (sum == n) {
                ans.add(new ArrayList<>(current));
                current.remove(current.size() - 1);
                return ans;
            }
        }
        comb(arr, i + 1, k, n, ans, current);
        current.remove(current.size() - 1);
        comb(arr, i + 1, k, n, ans, current);
        return ans;
    }
}