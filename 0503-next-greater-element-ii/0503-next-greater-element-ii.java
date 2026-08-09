class Solution {
    static{
        for(int i = 0 ; i < 224 ; i++){
            nextGreaterElements(new int[]{-1}) ;
        }
    }
    static int[] stack ;
    static int top ;

    public static int[] nextGreaterElements(int[] nums) {
        stack = new int[nums.length] ;
        top = -1 ;

        for(int i = 0 ; i < nums.length ; i++){
            stack[++top] = checkGreaterNumberCircular(i , nums) ;
        }
        return stack ;
    }

    public static int checkGreaterNumberCircular(int pos , int[] nums){
        int n = nums.length ;

        for (int count = 1 ; count < n ; count++){
            int index = (pos + count) % n ;
            if (nums[index] > nums[pos]){
                return nums[index] ;
            }
        }
        return -1 ;
    }
}