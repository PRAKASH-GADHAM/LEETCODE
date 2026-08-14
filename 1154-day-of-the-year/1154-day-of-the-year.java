class Solution {
    int[] normal = {0 , 31 , 59 , 90 , 120 , 151 , 181 , 212 , 243 , 273 , 304 , 334} ;
    int[] leap = {0 , 31 , 60 , 91 , 121 , 152 , 182 , 213 , 244 , 274 , 305 , 335} ;
    
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0 , 4)) ;
        int month = Integer.parseInt(date.substring(5 , 7)) ;
        int day = Integer.parseInt(date.substring(8 , 10)) ;

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            return leap[month - 1] + day ;
        }

        return normal[month - 1] + day ;
    }
}