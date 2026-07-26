class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length] ;
        for(int i = 0 ; i < nums.length ; i++){
            int j = 0 ;
            int count = 0 ;
            while(j < nums.length){
                if(nums[j] < nums[i] && j != i){
                    count++ ;
                }
                j++ ;
            }
            ans[i] = count ;
        }
        return ans ;
    }
}