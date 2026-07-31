class Solution {
    static{
        for(int i = 0 ; i < 50 ; i++){
            nextGreaterElement(0) ;
        }
    }

    public static int nextGreaterElement(int n){
        char[] digits = String.valueOf(n).toCharArray() ;
        int len = digits.length ;
        int[] nums = new int[len] ;

        for(int i = 0; i < len; i++){
            nums[i] = digits[i] - '0' ;
        }

        int i = len - 2 ;
        while(i >= 0 && nums[i] >= nums[i + 1]){
            i-- ;
        }

        if(i < 0){
            return -1 ;
        }

        int j = len - 1 ;
        while(nums[j] <= nums[i]){
            j-- ;
        }

        swap(nums, i, j) ;
        reverse(nums, i + 1, len - 1) ;

        long sum = 0 ;
        for(int num : nums){
            sum = sum * 10 + num ;
        }
        return sum > Integer.MAX_VALUE ? -1 : (int) sum ;
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }

    private static void reverse(int[] arr, int start, int end) {
        while(start < end){
            swap(arr, start, end) ;
            start++ ;
            end-- ;
        }
    }
}