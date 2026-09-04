class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        List<List<Integer>> diagonals = new ArrayList<>() ;

        for(int i = 0 ; i < nums.size() ; i++){
            for(int j = 0 ; j < nums.get(i).size() ; j++){
                int d = i + j ;
                if(d >= diagonals.size()){
                    diagonals.add(new ArrayList<>()) ;
                }
                diagonals.get(d).add(nums.get(i).get(j)) ;
            }
        }

        List<Integer> res = new ArrayList<>() ;

        for(List<Integer> diagonal : diagonals){
            for(int i = diagonal.size() - 1 ; i >= 0 ; i--){
                res.add(diagonal.get(i)) ;
            }
        }

        int[] result = new int[res.size()] ;

        for(int i = 0 ; i < res.size() ; i++){
            result[i] = res.get(i) ;
        }
        return result ;
    }
}