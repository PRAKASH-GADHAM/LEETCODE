class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean[] res = {false , false} ;
        res[0] = isBulky(length , width , height) ;
        res[1] = mass >= 100 ;

        if(res[0] && res[1]){
            return "Both" ;
        }
        else if(!res[0] && res[1]){
            return "Heavy" ;
        }
        else if(res[0] && !res[1]){
            return "Bulky" ;
        }
        else{
            return "Neither" ;
        }

    }

    public boolean isBulky(int l , int w , int h){
        long volume = (long) l * w * h;
        return l >= 10000 || w >= 10000 || h >= 10000 || volume >= 1000000000L;
    }
}