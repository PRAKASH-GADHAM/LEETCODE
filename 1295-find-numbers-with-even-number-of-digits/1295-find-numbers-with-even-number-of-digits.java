class Solution {
    public int findNumbers(int[] nums) {
        int even_no_of_digits = 0 ;

        for(int num : nums){
            int count = 0 ;
            while(num != 0){
                num /= 10 ;
                count++ ;
            }
            if(count % 2 == 0){
                even_no_of_digits++ ;
            }
        }
        return even_no_of_digits ;
    }
}