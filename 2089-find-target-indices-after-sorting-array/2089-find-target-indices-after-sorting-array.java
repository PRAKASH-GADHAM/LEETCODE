class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        HashMap<Integer , Integer> freq = new HashMap<>() ;
        for(int n : nums){
            freq.put(n , freq.getOrDefault(n , 0) + 1) ;
        }

        int less = 0 ;
        for(int key : freq.keySet()){
            if(key < target){
                less += freq.get(key) ;
            }
        }

        int count = freq.getOrDefault(target , 0) ;

        List<Integer> ans = new ArrayList<>() ;
        for(int i = 0 ; i < count ; i++){
            ans.add(less + i) ;
        }
        return ans ;
    }
}