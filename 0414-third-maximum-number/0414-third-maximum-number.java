class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        int firstMax = nums[nums.length - 1];

        Integer secondMax = MaxNum(nums, firstMax);
        if (secondMax == null) {
            return firstMax;
        }

        Integer thirdMax = MaxNum(nums, secondMax);
        if (thirdMax == null) {
            return firstMax;
        }

        return thirdMax;
    }

    public Integer MaxNum(int[] nums, int val) {
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < val) {
                return nums[i];
            }
        }
        return null;
    }
}