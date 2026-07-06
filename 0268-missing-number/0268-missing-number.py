class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        nums = set(nums)
        check = set(range(len(nums)+1))
        return check.difference(nums).pop()