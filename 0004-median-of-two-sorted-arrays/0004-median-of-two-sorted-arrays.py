class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        nums=list()
        nums=nums1+nums2
        nums.sort()
        n=len(nums)
        m=n//2
        if n%2==0:
            median=(nums[m]+nums[m-1])/2.0
            return median
        else:
            
            median=float(nums[m])
            return median