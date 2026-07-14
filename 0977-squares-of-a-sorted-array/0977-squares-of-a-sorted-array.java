class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length] ;
        int i = 0 ;
        int j = nums.length -1 ;
        int pos = nums.length -1 ;
        while(i <= j){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                squares[pos] = nums[i] * nums[i] ;
                i++ ;
            }
            else{
                squares[pos] = nums[j] * nums[j] ;
                j-- ;
            }
            pos-- ;
        }

    return squares ;

    }
}