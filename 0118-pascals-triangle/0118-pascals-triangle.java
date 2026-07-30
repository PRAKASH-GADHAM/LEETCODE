class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n = numRows ;
        List<List<Integer>> list = new ArrayList<>() ;
        for(int i = 0 ; i < n ; i++){
            List<Integer> l = new ArrayList<>() ;
            for(int j = 0 ; j <= i ; j++){
                if (j == 0 || j == i) {
                    l.add(1);
                } 
                else{
                    int val = list.get(i - 1).get(j - 1) + list.get(i - 1).get(j) ;
                    l.add(val) ;
                }
            }
            list.add(l) ;
        }
        return list ;
    }
}