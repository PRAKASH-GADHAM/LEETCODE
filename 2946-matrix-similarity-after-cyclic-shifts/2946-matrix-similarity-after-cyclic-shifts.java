class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        for(int i = 0 ; i < mat.length ; i++){
            if(i % 2 == 0){
                boolean res = leftCycle(mat , i , k) ;
                if(res == false) return false ;
            }
            else{
                boolean res = rightCycle(mat , i , k) ;
                if(res == false) return false ;
            }
        }
        return true ;
    }

    public boolean leftCycle(int[][] mat , int row , int k){
        int n = mat[row].length ;
        int[] left = new int[n + k] ;
        int pos = k ;
        for(int i = 0 ; i < left.length ; i++){
            int m = i % n ;
            left[i] = mat[row][m] ;
        }
        int j = 0 ;
        while(j < n){
            if(left[pos] != mat[row][j]){
                return false ;
            }
            j++ ;
            pos++ ;
        }
        return true ;
    }

    public boolean rightCycle(int[][] mat , int row , int k){
        int n = mat[row].length ;
        int[] right = new int[n + k] ;
        int pos = k ;
        for(int i = right.length - 1 ; i >= 0 ; i--){
            int m = i % n ;
            right[i] = mat[row][m] ;
        }
        int j = 0 ;
        while(j < n){
            if(right[pos] != mat[row][j]){
                return false ;
            }
            j++ ;
            pos++ ;
        }
        return true ;
    }
}