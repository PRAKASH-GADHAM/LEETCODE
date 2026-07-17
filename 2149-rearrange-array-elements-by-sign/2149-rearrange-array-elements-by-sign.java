class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i = 0 ;
        int j = 1 ;
        int l = nums.length ;
        int[] arr = new int[l] ;
        for(int num : nums){
            if(num > 0){
                arr[i] = num ;
                i += 2 ;
            }
            else 
            {
                arr[j] = num ;
                j +=2 ;
            }
        }

        return arr ;
    }
}