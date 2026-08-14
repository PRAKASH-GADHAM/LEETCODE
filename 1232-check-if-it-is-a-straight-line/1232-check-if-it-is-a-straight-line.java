class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int i = 0 ;

        while(i < coordinates.length - 2){
            int j = i + 1 ;
            int k = i + 2 ;
            double area = 0.5 * Math.abs(coordinates[i][0] * (coordinates[j][1] - coordinates[k][1]) + coordinates[j][0] * (coordinates[k][1] - coordinates[i][1]) + coordinates[k][0] * (coordinates[i][1] - coordinates[j][1])) ;

            if(area != 0){
                return false ;
            }
            i++ ;
        }
        return true ;
    }
}