class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1 ;
        int j = n - 1 ;
        int l = m + n - 1 ;
        while(j >= 0){
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[l] = nums1[i] ;
                i-- ;
            }
            else{
                nums1[l] = nums2[j] ;
                j-- ;
            }
            l-- ;
        }        
    }
}