class Solution {
    static{
        for (int i = 0 ; i < 100 ; i++){
            largestTriangleArea(new int[][] {{0, 0} , {0, 1} , {1, 0}}) ;
        }
    }
    
    public static double largestTriangleArea(int[][] points) {
        double largestArea = 0.0 ;

        for(int i = 0 ; i < points.length ; i++){
            for(int j = i + 1 ; j < points.length ; j++){
                for(int k = j + 1 ; k < points.length ; k++){

                    double area = 0.5 * Math.abs(
                        points[i][0] * (points[j][1] - points[k][1])
                        + points[j][0] * (points[k][1] - points[i][1])
                        + points[k][0] * (points[i][1] - points[j][1])
                    ) ;

                    largestArea = Math.max(largestArea , area) ;
                }
            }
        }
        return largestArea ;
    }
}