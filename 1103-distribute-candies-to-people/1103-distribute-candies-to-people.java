class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int i = 1 ;
        int j = 0 ;
        int[] nums = new int[num_people] ;

        while(candies > 0){
            if(candies - i <= 0){
                nums[j] += candies ;
            }
            else{
                nums[j] += i ; 
            }

            candies -= i ;

            if(j == nums.length - 1){
                j = 0 ;
            }
            else{
                j++ ;
            }
            i++ ;
        }
        return nums ;
    }
}