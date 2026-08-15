class Solution {
    char[][] chess = { {'b' , 'w' , 'b' , 'w' , 'b' , 'w' , 'b' , 'w'} ,
                       {'w' , 'b' , 'w' , 'b' , 'w' , 'b' , 'w' , 'b'} ,
                       {'b' , 'w' , 'b' , 'w' , 'b' , 'w' , 'b' , 'w'} ,
                       {'w' , 'b' , 'w' , 'b' , 'w' , 'b' , 'w' , 'b'} ,
                       {'b' , 'w' , 'b' , 'w' , 'b' , 'w' , 'b' , 'w'} ,
                       {'w' , 'b' , 'w' , 'b' , 'w' , 'b' , 'w' , 'b'} ,
                       {'b' , 'w' , 'b' , 'w' , 'b' , 'w' , 'b' , 'w'} ,
                       {'w' , 'b' , 'w' , 'b' , 'w' , 'b' , 'w' , 'b'} , } ;
                       
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int cor1 = coordinate1.charAt(0) - 'a' ;
        int cor2 = coordinate1.charAt(1) - '1' ;
        int cor3 = coordinate2.charAt(0) - 'a' ;
        int cor4 = coordinate2.charAt(1) - '1' ;
        return chess[cor1][cor2] == chess[cor3][cor4] ;
    }
}