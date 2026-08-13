class Solution {
    public int titleToNumber(String columnTitle) {
        int num = 0 ;
        for(char ch : columnTitle.toCharArray()){
            int value = ch - 'A' + 1 ;
            num = num * 26 + value ;
        }
        return num ;
    }
}