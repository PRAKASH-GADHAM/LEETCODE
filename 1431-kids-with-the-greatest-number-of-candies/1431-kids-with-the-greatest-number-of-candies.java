class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>() ;
        for(int i = 0 ; i < candies.length ; i++){
            boolean res = true ;
            int j = 0 ;
            int curr = candies[i] + extraCandies ;
            while(j < candies.length){
               if(candies[j] > curr){ 
                    res = false ;
                    break ;
               }
               j++ ;
            }
            result.add(res) ;
        }
        return result ;
    }
}