class Solution {
    public int missingInteger(int[] nums) {
        int s = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1] + 1){
                s += nums[i] ;
            } 
            else{
                break ;
            }
        }

        Set<Integer> numSet = new HashSet<>() ;
        for(int num : nums){
            numSet.add(num) ;
        }
        
        while(numSet.contains(s)){
            s++ ;
        }
        return s ;
    }
}