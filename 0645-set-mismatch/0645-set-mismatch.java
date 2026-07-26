class Solution {
    public int[] findErrorNums(int[] nums) {
        int missing = 0 ;
        int duplicate = 0 ;
        int[] hash = new int[nums.length] ;
        for(int num : nums){
            hash[num - 1]++ ;
            if(hash[num - 1] > 1){
                duplicate = num ;
            }
        }
        for(int i = 1 ; i <= nums.length ; i++){
            if(hash[i - 1] == 0){
                missing = i ;
                return new int[]{duplicate , missing} ;
            }
        }
        return new int[]{duplicate , missing} ;
    }
}