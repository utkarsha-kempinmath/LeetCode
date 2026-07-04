class Solution {
    public boolean isPowerOfTwo(int n){
        if(n <= 0) return false;
        return check(n);
    }
    public boolean check(int n){
        if(n == 1) return true;
        if(n % 2 != 0) return false;
        return check(n / 2);
    }
}