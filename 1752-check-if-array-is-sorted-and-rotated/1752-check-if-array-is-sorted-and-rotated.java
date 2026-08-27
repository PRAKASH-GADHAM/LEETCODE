class Solution {
    static{
        for(int i = 0; i < 50; i++){
            check(new int[]{1, 2, 3, 4, 5}) ;
        }
    }

    public static boolean check(int[] nums) {
        int count = 0 ;
        int n = nums.length ;

        for(int i = 0 ; i < n ; i++){
            if(nums[i] > nums[(i + 1) % n]){
                count++ ;
            }
        }
        return count <= 1;
    }
}