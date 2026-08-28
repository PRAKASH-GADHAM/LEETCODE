class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int even = 0 ;
        int[] ans = new int[queries.length] ;

        for(int num : nums){
            if(num % 2 == 0) even += num ;
        }

        for(int i = 0 ; i < queries.length ; i++){
            int index = queries[i][1] ;
            int val = queries[i][0] ;
            int sum = nums[index] + val ;

            if(sum % 2 == 0 && nums[index] % 2 == 0){
                ans[i] = even + val ;
                even += val ;
            }
            else if(sum % 2 == 0 && nums[index] % 2 != 0){
                ans[i] = even + sum ;
                even += sum ;
            }
            else if(sum % 2 != 0 && nums[index] % 2 == 0){
                ans[i] = even - nums[index] ;
                even -= nums[index] ;
            }
            else{
                ans[i] = even ;
            }
            nums[index] = sum ;
        }
        return ans ;
    }
}