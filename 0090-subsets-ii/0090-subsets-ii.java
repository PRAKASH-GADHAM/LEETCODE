class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums) ; 
        int total_subsets = 1 << nums.length ;
        List<List<Integer>> list = new ArrayList<>() ;
        list.add(new ArrayList<>()) ;

        for (int i = 1; i < total_subsets; i++) {
            List<Integer> l = new ArrayList<>() ;
            boolean isValid = true ;

            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) != 0) {
                    if (j > 0 && nums[j] == nums[j - 1] && (i & (1 << (j - 1))) == 0) {
                        isValid = false ;
                        break ;
                    }
                    l.add(nums[j]) ;
                }
            }

            if (isValid) {
                list.add(l) ;
            }
        }
        return list ;
    }
}