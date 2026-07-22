class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s) ;
        if(k >= s.length()){
            int i = 0 ;
            int j = s.length() - 1 ;
            while(i <= j){
                char temp = sb.charAt(i) ;
                sb.setCharAt(i, sb.charAt(j)) ;
                sb.setCharAt(j, temp) ;
                i++ ;
                j-- ;
            }
        }
        else{
            int i = 0 ;
            while(i < s.length()){
                int left = i;
                int right = Math.min(i + k - 1, s.length() - 1);
                while (left < right) {
                    char temp = sb.charAt(left);
                    sb.setCharAt(left, sb.charAt(right));
                    sb.setCharAt(right, temp);
                    left++;
                    right--;
                }
                i += 2 * k;
            }
        }
    return sb.toString() ;
    }

}