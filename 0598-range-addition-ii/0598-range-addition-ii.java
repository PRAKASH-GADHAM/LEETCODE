class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int present_row = Integer.MAX_VALUE ;
        int present_col = Integer.MAX_VALUE ;

        for(int i = 0 ; i < ops.length ; i++){
            int row = ops[i][0] ;
            int col = ops[i][1] ;

            if(row < present_row){
                present_row = row ;
            }

            if(col < present_col){
                present_col = col ;
            }
        }
        if(present_col == Integer.MAX_VALUE || present_row == Integer.MAX_VALUE) return m * n ;
        return present_col * present_row ;
    }
}