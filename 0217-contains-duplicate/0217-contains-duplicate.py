class Solution(object):
    def containsDuplicate(self, nums):
        se = set(nums)
        return len(nums) != len(se)