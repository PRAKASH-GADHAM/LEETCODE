class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer , Integer> hash = new HashMap<>() ;
        int n = nums.length ;
        int majority = n / 2 ;

        for(int num : nums){
            int count = hash.getOrDefault(num , 0) + 1 ;
            hash.put(num , count) ;

            if(count > majority) return num ;
        }
        return 0 ;
    }
}