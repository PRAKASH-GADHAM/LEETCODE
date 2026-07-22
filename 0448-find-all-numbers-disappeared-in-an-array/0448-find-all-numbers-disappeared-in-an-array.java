class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] hash = new int[nums.length] ;
        int n = nums.length ;
        for(int num : nums){
            hash[(num - 1) % n]++ ;
        }
        List<Integer> list = new ArrayList<>() ;
        for(int i = 1 ; i <= n ; i++){
            if(hash[i - 1] == 0){
                list.add(i) ;
            }
        }
        return list ;
    }
}