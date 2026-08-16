class Solution {
    public int maximum69Number (int num) {
        int[] integer = new int[Integer.toString(num).length()] ;
        int n = integer.length - 1 ;

        while(num > 0){
            integer[n] = num % 10 ;
            num /= 10 ;
            n-- ;
        }

        int count = 1 ;
        int number = 0 ;

        for(int i : integer){
            if(i == 6 && count == 1){
                number = number * 10 + 9 ;
                count-- ;
            }
            else{
                number = number * 10 + i ;
            }
        }
        return number ;
    }
}