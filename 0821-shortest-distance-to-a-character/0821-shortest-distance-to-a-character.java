class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        int i = 0, j = 0;
        
        while (i < n) {
            if (s.charAt(i) == c) {
                while (j <= i) {
                    ans[j] = i - j;
                    j++;
                }
            }
            i++;
        }

        while (j < n) {
            ans[j] = Integer.MAX_VALUE;
            j++;
        }

        i = n - 1;
        j = n - 1;
        int lastC = -1;

        while (i >= 0) {
            if (s.charAt(i) == c) {
                lastC = i;
                while (j >= i) {
                    int dist = j - i;
                    if (dist < ans[j]) {
                        ans[j] = dist;
                    }
                    j--;
                }
            }
            i--;
        }

        while (j >= 0) {
            ans[j] = lastC - j;
            j--;
        }

        return ans;
    }
}   