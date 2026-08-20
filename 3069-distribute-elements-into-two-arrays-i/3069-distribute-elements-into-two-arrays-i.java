class Solution {
    int top1 = -1 ;
    int top2 = -1 ;

    public int[] resultArray(int[] nums) {
        int[] stack1 = new int[nums.length] ;
        int[] stack2 = new int[nums.length] ;
        int[] array = new int[nums.length] ;
        stack1[++top1] = nums[0] ;
        stack2[++top2] = nums[1] ;

        for(int i = 2 ; i < nums.length ; i++){
            if(stack1[top1] > stack2[top2]){
                stack1[++top1] = nums[i] ;
            }
            else{
                stack2[++top2] = nums[i] ;
            }
        }
        for(int i = 0 ; i <= top1 ; i++){
            array[i] = stack1[i] ;
        }
        for(int i = 0 ; i <= top2 ; i++){
            array[top1 + 1 + i] = stack2[i] ;
        }
        return array ;
    }
}