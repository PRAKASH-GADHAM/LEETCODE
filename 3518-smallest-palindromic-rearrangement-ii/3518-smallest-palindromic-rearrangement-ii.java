import java.math.BigInteger;

class Solution {
    public String smallestPalindrome(String s, int k) {
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) cnt[c - 'a']++;

        int[] half = new int[26];
        String mid = "";
        int len = 0;

        for (int i = 0; i < 26; i++) {
            half[i] = cnt[i] / 2;
            len += half[i];
            if ((cnt[i] & 1) == 1)
                mid = String.valueOf((char) ('a' + i));
        }

        BigInteger ways = calcWays(half);
        BigInteger K = BigInteger.valueOf(k);

        if (ways.compareTo(K) < 0) return "";

        StringBuilder left = new StringBuilder();

        while (len > 0) {
            for (int i = 0; i < 26; i++) {
                if (half[i] == 0) continue;

                BigInteger cur = ways.multiply(BigInteger.valueOf(half[i]))
                                     .divide(BigInteger.valueOf(len));

                if (cur.compareTo(K) >= 0) {
                    left.append((char) ('a' + i));
                    half[i]--;
                    ways = cur;
                    len--;
                    break;
                } else {
                    K = K.subtract(cur);
                }
            }
        }

        StringBuilder ans = new StringBuilder(left);
        ans.append(mid);
        ans.append(left.reverse());

        return ans.toString();
    }

    private BigInteger calcWays(int[] half) {
        BigInteger res = BigInteger.ONE;
        int sum = 0;

        for (int x : half) {
            if (x == 0) continue;
            res = res.multiply(comb(sum + x, x));
            sum += x;
        }

        return res;
    }

    private BigInteger comb(int n, int r) {
        r = Math.min(r, n - r);
        BigInteger res = BigInteger.ONE;

        for (int i = 1; i <= r; i++) {
            res = res.multiply(BigInteger.valueOf(n - r + i));
            res = res.divide(BigInteger.valueOf(i));
        }

        return res;
    }
}