class Solution {
    public int largestInteger(int n, int s) {
        if (s == 0) {
            return 0;
        }
        if (s > 9 * n) {
            return -1;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (s >= 9) {
                result.append('9');
                s -= 9;
            } else {
                result.append(s);
                s = 0;
            }
        }
        
        return Integer.parseInt(result.toString());
    }
}   