class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer , Integer> hash = new HashMap<>() ;
        List<Integer> list = new ArrayList<>() ;
        int n = nums.length ;
        int majority = n / 3 ;

        for(int num : nums){
            int count = hash.getOrDefault(num , 0) + 1 ;
            hash.put(num , count) ;

            if(count > majority && !list.contains(num)) list.add(num) ;
        }
        return list ;
    }
}