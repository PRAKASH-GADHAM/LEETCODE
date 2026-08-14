class Solution {
    char[][] chess = { {'b' , 'w' , 'b' , 'w' , 'b' , 'w' , 'b' , 'w'} ,
                       {'w' , 'b' , 'w' , 'b' , 'w' , 'b' , 'w' , 'b'} ,
                       {'b' , 'w' , 'b' , 'w' , 'b' , 'w' , 'b' , 'w'} ,
                       {'w' , 'b' , 'w' , 'b' , 'w' , 'b' , 'w' , 'b'} ,
                       {'b' , 'w' , 'b' , 'w' , 'b' , 'w' , 'b' , 'w'} ,
                       {'w' , 'b' , 'w' , 'b' , 'w' , 'b' , 'w' , 'b'} ,
                       {'b' , 'w' , 'b' , 'w' , 'b' , 'w' , 'b' , 'w'} ,
                       {'w' , 'b' , 'w' , 'b' , 'w' , 'b' , 'w' , 'b'} , } ;

    public boolean squareIsWhite(String coordinates) {
        int cor1 = coordinates.charAt(0) - 'a' ;
        int cor2 = coordinates.charAt(1) - '1' ;
        return chess[cor1][cor2] == 'w' ;
    }
}