class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder s = new StringBuilder() ;
        while(columnNumber > 0){
            columnNumber-- ;
            char c = (char) ('A' + (columnNumber % 26)) ;
            s.append(c);
            columnNumber /= 26 ;
        }
        return s.reverse().toString();
    }
}