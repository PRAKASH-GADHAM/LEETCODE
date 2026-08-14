class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer , Integer> hash = new HashMap<>() ;
        int count = 0 ;

        for(int num : nums){
            int freq = hash.getOrDefault(num , 0) ;
            count += freq ;
            hash.put(num , freq + 1) ;
        }
        return count ;
    }
}