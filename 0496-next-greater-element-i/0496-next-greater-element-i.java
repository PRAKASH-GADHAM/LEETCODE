class Solution {
    int[] stack ;
    int top = -1 ;
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        stack = new int[nums1.length] ;

        for(int num : nums1){
            stack[++top] = num ;
            checkGreater(num , nums2) ;
        }
        return stack ;
    }

    public void checkGreater(int num , int[] nums){
        int max = 0 ;
        int pos = 0 ;

        while(pos < nums.length && nums[pos] != num){
            pos++ ;
        }

        while(pos < nums.length - 1){
            if(nums[pos + 1] > num){
                pos++ ;
                break ;
            }
            else{
            pos++ ;
            }
        }
        if(nums[pos] > num){
            stack[top] = nums[pos] ;
        }
        else{
            stack[top] = -1 ;
        }
    }
}