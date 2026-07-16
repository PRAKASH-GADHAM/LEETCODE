class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> hash = new HashMap<>() ;
        int n = nums.length ;
        int Majority = 0 ;
        for(int num : nums){
            if(hash.containsKey(num)){
                hash.put(num, hash.get(num) + 1) ;
            }
            else{
                hash.put(num, 1) ;
            }

            if(hash.get(num) > Math.abs(n / 2)){
                Majority = (int) num ;
            }
        }
        return Majority ;
    }
}