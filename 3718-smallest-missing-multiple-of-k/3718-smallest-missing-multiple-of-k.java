class Solution {
    public int missingMultiple(int[] nums, int k) {
        int[] hash = new int[101] ;
        for(int num : nums){
            hash[num]++ ;
        }

        int i = k ;
        while(i <= 100){
            if(hash[i] == 0){
                return i ;
            }
            i += k ;
        }

        return i ;
    }
}