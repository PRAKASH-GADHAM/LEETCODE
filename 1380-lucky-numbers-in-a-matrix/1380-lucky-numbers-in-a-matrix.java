class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length ;
        int n = matrix[0].length ;
        
        List<Integer> rowMins = new ArrayList<>() ;
        for(int i = 0 ; i < m ; i++){
            int min = Integer.MAX_VALUE ;
            for(int j = 0 ; j < n ; j++){
                min = Math.min(min, matrix[i][j]) ;
            }
            rowMins.add(min) ;
        }
        
        List<Integer> colMaxs = new ArrayList<>() ;
        for(int j = 0 ; j < n ; j++){
            int max = Integer.MIN_VALUE ;
            for(int i = 0 ; i < m ; i++){
                max = Math.max(max, matrix[i][j]) ;
            }
            colMaxs.add(max) ;
        }
        
        List<Integer> result = new ArrayList<>() ;
        for(int val : rowMins){
            if(colMaxs.contains(val)){
                result.add(val) ;
            }
        }
        return result ;
    }
}