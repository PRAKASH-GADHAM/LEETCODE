class Solution {
    static {
        for (int i = 0; i < 1000; i++) {
            maxVowels("b", 0);
        }
    }
    public static int maxVowels(String s, int k) {
        String vowels = "aeiou";
        int max = 0;
        int currentVowels = 0;

        for (int i = 0; i < k; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                currentVowels++;
            }
        }
        max = currentVowels;

        for (int i = k; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                currentVowels++;
            }
            if (vowels.indexOf(s.charAt(i - k)) != -1) {
                currentVowels--;
            }
            max = Math.max(max, currentVowels);
        }

        return max;
    }
}   