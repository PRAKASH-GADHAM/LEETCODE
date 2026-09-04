import java.util.Arrays;

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            rotate90(mat);
        }
        return false;
    }

    private void rotate90(int[][] matrix) {
        int n = matrix.length ;
        
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                int temp = matrix[i][j] ;
                matrix[i][j] = matrix[j][i] ;
                matrix[j][i] = temp ;
            }
        }

        for(int i = 0 ; i < n ; i++){
            int left = 0 ;
            int right = n - 1 ;
            while(left < right){
                int temp = matrix[i][left] ;
                matrix[i][left] = matrix[i][right] ;
                matrix[i][right] = temp ;
                left++ ;
                right-- ;
            }
        }
    }
}