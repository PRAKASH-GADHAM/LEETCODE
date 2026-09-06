class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0" ;

        int n = num1.length() - 1 ;
        int m = num2.length() - 1 ;
        String sum = "0" ;
        String ten = "1" ;

        for(int i = n ; i >= 0 ; i--){
            int number = num1.charAt(i) - '0' ;
            String isum = "" ;
            int rem = 0 ;

            for(int j = m ; j >= 0 ; j--){
                int num = num2.charAt(j) - '0' ;
                int mul = number * num + rem ;
                isum = (mul % 10) + isum ;
                rem = mul / 10 ;
            }

            if(rem != 0){
                isum = rem + isum ;
            }

            StringBuilder temp = new StringBuilder(isum) ;

            for(int k = 0 ; k < n - i ; k++){
                temp.append('0') ;
            }

            sum = add(sum, temp.toString()) ;
        }

        return sum ;
    }

    public String add(String a, String b) {
        int i = a.length() - 1 ;
        int j = b.length() - 1 ;
        int carry = 0 ;
        StringBuilder result = new StringBuilder() ;

        while(i >= 0 || j >= 0 || carry != 0){
            int x = i >= 0 ? a.charAt(i--) - '0' : 0 ;
            int y = j >= 0 ? b.charAt(j--) - '0' : 0 ;
            int total = x + y + carry ;
            result.append(total % 10) ;
            carry = total / 10 ;
        }
        return result.reverse().toString() ;
    }
}