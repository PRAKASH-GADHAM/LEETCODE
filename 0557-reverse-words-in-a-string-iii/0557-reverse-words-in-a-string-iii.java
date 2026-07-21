class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        int n = s.length();
        int i = 0;
        
        while (i < n) {
            while (i < n && sb.charAt(i) == ' ') {
                i++;
            }
            if (i >= n) break;
            int j = i;
            while (j < n && sb.charAt(j) != ' ') {
                j++;
            }
            int left = i;
            int right = j - 1;
            while (left < right) {
                char temp = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);
                left++;
                right--;
            }
            i = j;
        }
        
        return sb.toString();
    }
}   