class Solution {
    public int maxOperations(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= k){
                nums[i] = 0;
            }
        }
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int operations = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                operations++;
                left++;
                right--;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }
        return operations;
    }
}   