class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums) ;
        int ans = 0 ;
        int[] hash = new int[nums.length + 1] ;
        for(int num : nums){
            hash[num] = num ; 
        }
        for(int i = 0 ; i < nums.length + 1 ; i++){
            ans = ans ^ i ^ hash[i] ;
        }
        return ans ;
    }
}