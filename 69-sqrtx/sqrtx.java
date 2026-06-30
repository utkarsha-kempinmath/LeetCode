class Solution {
    public int mySqrt(int x) {
        int s = 0;
        int e = x;
        int ans = 0;

        while (s <= e) {
            int m = s + (e - s) / 2;
            long sq = (long) m * m;

            if (sq == x)
                return m;

            if (sq < x) {
                ans = m;    
                s = m + 1;
            } else {
                e = m - 1;
            }
        }

        return ans;
    }
}