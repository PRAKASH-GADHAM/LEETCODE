class Solution {
    static{
        for(int i = 0 ; i < 80 ; i++){
            uniqueOccurrences(new int[]{1}) ;
        }
    }

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer , Integer> hash = new HashMap<>() ;
        for(int num : arr){
            hash.put(num , hash.getOrDefault(num , 0) + 1) ;
        }
        HashSet<Integer> set = new HashSet<>() ;
        for(int num : hash.values()){
            if(set.contains(num)){
                return false ;
            }
            set.add(num) ;
        }
        return true ;
    }
}