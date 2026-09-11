class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10] ;

        for(int digit : digits){
            freq[digit]++ ;
        }

        int count = 0 ;

        for(int number = 100 ; number <= 998 ; number += 2){
            int hun = number / 100 ;
            int ten = (number / 10) % 10 ;
            int one = number % 10 ;
            int[] temp = Arrays.copyOfRange(freq , 0 , 10) ;
            temp[hun]-- ;
            temp[ten]-- ;
            temp[one]-- ;

            if(temp[hun] >= 0 && temp[ten] >=0 && temp[one] >= 0) count++ ;
        }
        return count ;
    }
}