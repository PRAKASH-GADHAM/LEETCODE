class Solution {
    int[] year = {0 , 31 , 59 , 90 , 120 , 151 , 181 , 212 , 243 , 273 , 304 , 334} ;

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int alice_in = dayS(arriveAlice) ;
        int alice_out = dayS(leaveAlice) ;
        int bob_in = dayS(arriveBob) ;
        int bob_out = dayS(leaveBob) ;

        int start = Math.max(alice_in, bob_in) ;
        int end = Math.min(alice_out, bob_out) ;

        if(start <= end){
            return end - start + 1 ;
        }
        return 0 ;
    }

    public int dayS(String date){
        int month = Integer.parseInt(date.substring(0 , 2)) - 1 ;
        int day = Integer.parseInt(date.substring(3 , 5)) ;
        return year[month] + day ;
    }
}