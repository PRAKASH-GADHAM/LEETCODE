class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] freq = new int[101] ;
        int first = -1 ;
        int second = -1 ;
        for(int num : nums){
            freq[num]++ ;
            if(freq[num] > 1){
                if(first == -1){
                    first = num ;
                }
                else{
                    second = num ;
                    return new int[]{first , second} ;
                }
            }
        }
        return new int[]{-1 , -1} ;
    } 
}