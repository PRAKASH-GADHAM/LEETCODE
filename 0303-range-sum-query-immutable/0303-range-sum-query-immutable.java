class NumArray {
    private int[] num ;
    public NumArray(int[] nums) {
        num = new int[nums.length + 1] ;
        for(int i = 0 ; i < nums.length ; i++){
            num[i] = nums[i] ; 
        }
    }
    
    public int sumRange(int left, int right){
        int sum = 0 ;
        while(left <= right){
            sum = sum + num[left] ;
            left++ ;
        }
        return sum ;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */