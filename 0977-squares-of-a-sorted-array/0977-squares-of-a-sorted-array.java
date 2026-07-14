class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length] ;
        int i = 0 ;
        while(i < nums.length){
            squares[i] = (int) Math.pow(nums[i] , 2) ;
            i++ ;
        }
        Arrays.sort(squares) ;

    return squares ;

    }
}