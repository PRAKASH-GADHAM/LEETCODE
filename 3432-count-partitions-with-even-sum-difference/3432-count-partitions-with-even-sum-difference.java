class Solution {
    public int countPartitions(int[] nums) {
        int rightsum = 0 ;
        int leftsum = 0 ;

        for(int num : nums){
            rightsum += num ;
        }

        int partitions = 0 ;

        for(int i = 0 ; i < nums.length - 1 ; i++){
            leftsum += nums[i] ;
            if((leftsum - (rightsum - leftsum)) % 2 == 0){
                partitions++ ;
            }
        }
        return partitions ;
    }
}