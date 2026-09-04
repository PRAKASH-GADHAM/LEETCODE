class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length ;
        int n = grid[0].length ;
        List<List<Integer>> list = new ArrayList<>() ;
        int total = m * n ;
        k = k % total ;

        for(int i = 0 ; i < m ; i++){
            List<Integer> l = new ArrayList<>() ;
            for(int j = 0 ; j < n  ; j++){
                int newIdx = i * n + j ;
                int originalIdx = (newIdx - k + total) % total ;
                int originalRow = originalIdx / n ;
                int originalCol = originalIdx % n ;
                l.add(grid[originalRow][originalCol]) ;
            }
            list.add(l) ;
        }

        return list ;
    }
}