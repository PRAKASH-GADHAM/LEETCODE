class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer , Integer> hash = new HashMap<>() ;
        for(int num : arr){
            hash.put(num , hash.getOrDefault(num , 0) + 1) ;
        }
        Set<Integer> set = new HashSet<>() ;
        for(int num : hash.values()){
            if(!set.contains(num)){
                set.add(num) ;
            }
            else{
                return false ;
            }
        }
        return true ;
    }
}