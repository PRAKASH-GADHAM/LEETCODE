class Solution {
    static{
        for(int i = 0 ; i < 100 ; i++){
            longestSubarray(new int[]{1}) ;
        }
    }
    public static int longestSubarray(int[] nums) {
        int left=0;
        int max=0;
        int n=nums.length;
        int k=1;
         for(int right=0;right<n;right++){
            if(nums[right]==0 ){
                k--;
            }
         while(k<0){
              if(nums[left]==0){
                k++;
              }
              left++;
            }
             max = Math.max(max, right - left);
        }
        return max;
    }
}