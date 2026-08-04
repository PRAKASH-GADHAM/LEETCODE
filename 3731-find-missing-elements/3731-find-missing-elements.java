class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums) ;
        List<Integer> list = new ArrayList<>() ;
        int n = nums[nums.length - 1] ;
        int[] hash = new int[n] ;
        for(int num : nums){
            hash[(num - 1)%n]++ ;
        }

        for(int i = nums[0] ; i < n ; i++){
            if(hash[i - 1] == 0){
                list.add(i) ;
            }
        }
        return list ;
    }
}