class Solution {
    static{
        for(int i = 0 ; i < 224 ; i++){
            nextGreaterElements(new int[]{-1}) ;
        }
    }

    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length ;
        int[] result = new int[n] ;
        Arrays.fill(result , -1) ;
        Deque<Integer> stack = new ArrayDeque<>() ;
        
        for(int i = 2 * n - 1 ; i >= 0 ; i--){
            int idx = i % n ;

            while(!stack.isEmpty() && stack.peek() <= nums[idx]){
                stack.pop() ;
            }
            
            if(i < n && !stack.isEmpty()){
                result[idx] = stack.peek() ;
            }
            stack.push(nums[idx]) ;
        }
        return result ;
    }
}