class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = hasHing(nums1) ;
        Set<Integer> set2 = hasHing(nums2) ;
        List<Integer> list1 = liSt(set1 , set2) ;
        List<Integer> list2 = liSt(set2 , set1) ;
        List<List<Integer>> list = new ArrayList<>() ;
        list.add(list1) ;
        list.add(list2) ;
        return list ;
    }

    public Set<Integer> hasHing(int[] nums){
        Set<Integer> set = new HashSet<>() ;
        for (int num : nums) {
            set.add(num) ;
        }
        return set ;
    }

    public List<Integer> liSt(Set<Integer> set1 , Set<Integer> set2){
        List<Integer> list = new ArrayList<>() ;
        for(int num : set1){
            if(!set2.contains(num)){
                list.add(num) ;
            }
        }
        return list ;
    }

}