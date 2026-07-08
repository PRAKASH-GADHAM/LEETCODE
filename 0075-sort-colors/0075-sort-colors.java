class Solution {
    public int[] sortColors(int[] nums) {
        int[] count = {0,0,0};
        for(int num : nums){
            if(num == 0)
                count[0] += 1 ;
            else if(num == 1)
                count[1] += 1 ;
            else
                count[2] += 1 ;
        }

        int k = 0 ;
        int n = 0 ;
        for(int i = 0 ; i < 3 ; i++){
            while(k < count[i]){
                nums[n] = i ;
                n++;
                k++;
            }
            k = 0 ;
        }
        return nums ;
    }
}