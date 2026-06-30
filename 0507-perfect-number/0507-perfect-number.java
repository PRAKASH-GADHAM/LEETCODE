class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }

        return helper(2, num) + 1 == num;
    }

    public static int helper(int n, int num) {

        if (n * n > num) {
            return 0;
        }

        if (num % n != 0) {
            return helper(n + 1, num);
        }

        if (n == num / n) {
            return n + helper(n + 1, num);
        }

        return n + (num / n) + helper(n + 1, num);
    }
}