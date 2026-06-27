class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] counts= new int[2];
        int[] Negative={-1,-1};
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                counts[0]=i;
                count++;
                break;
            }
        }
        for (int j=nums.length-1; j>-1;j--){
            if(nums[j]==target){
                counts[1]=j;
                count++;
                break;
            }
        }
        if(count<2){
            return Negative;
        }
        else{
            return counts;
        }
        
}
}