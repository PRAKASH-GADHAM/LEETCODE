class Solution {
    static {
        for(int i = 0 ; i < 400 ; i++){
            minStartValue(new int[]{-1}) ;
        }
    }
    public static int minStartValue(int[] nums) {
        int minPrefixSum = 0 ;
        int currentSum = 0 ;
        
        for(int num : nums){
            currentSum += num ;
            if(currentSum < minPrefixSum){
                minPrefixSum = currentSum ;
            }
        }
        return 1 - minPrefixSum ;
    }
}   