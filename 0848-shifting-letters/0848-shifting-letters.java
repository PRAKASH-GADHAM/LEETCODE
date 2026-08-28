class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int sum = 0 ;
        char[] ch = s.toCharArray() ;

        for(int i = shifts.length - 1 ; i >= 0 ; i--){
            sum = (sum + shifts[i] % 26) % 26 ;
            ch[i] = (char) ('a' + (ch[i] - 'a' + sum) % 26) ;
        }
        return new String(ch) ;
    }
}