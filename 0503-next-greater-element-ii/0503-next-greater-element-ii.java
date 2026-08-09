class Solution {
    int[] stack ;
    int top = -1 ;

    public int[] nextGreaterElements(int[] nums) {
        stack = new int[nums.length] ;

        for(int i = 0 ; i < nums.length ; i++){
            stack[++top] = nums[i] ;
            checkGreaterNumberCircular(i , nums) ;
        }
        return stack ;
    }

    public void checkGreaterNumberCircular(int pos , int[] nums){
        int maxLast = Integer.MIN_VALUE ;
        int maxFirst = Integer.MIN_VALUE ;
        int i = pos ;
        int j = 0 ;

        if(i < nums.length - 1){
            while(i < nums.length - 1){
                if(nums[i + 1] > nums[pos]){
                    maxLast = nums[i + 1] ;
                    i++ ;
                    break ;
                }
                else{
                    i++ ;
                }
            }
        }
        
        while(j < pos){
            if(nums[j] >= maxLast && nums[j] > nums[pos]){
                maxFirst = nums[j] ;
                break ;
            }
            else{
                j++ ;
            }
        }

        if(maxLast > nums[pos] && maxFirst > nums[pos]){
            stack[top] = maxLast ;
        }
        else if(maxLast == Integer.MIN_VALUE && maxFirst > nums[pos]){
            stack[top] = maxFirst ;
        }
        else if(maxFirst == Integer.MIN_VALUE && maxLast > nums[pos]){
            stack[top] = maxLast ;
        }
        else{
            stack[top] = -1 ;
        }
    }
}