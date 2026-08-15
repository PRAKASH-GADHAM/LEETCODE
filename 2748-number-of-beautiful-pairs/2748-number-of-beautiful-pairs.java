class Solution {
    public int countBeautifulPairs(int[] nums) {
        int count = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
            int first = firstDigit(nums[i]) ;
            for(int j = i + 1 ; j < nums.length ; j++){
                int last = nums[j] % 10 ;
                if(gcd(first, last) == 1){
                    count++ ;
                }
            }
        }
        return count ;
    }

    public int firstDigit(int num) {
        while(num >= 10){
            num /= 10 ;
        }
        return num ;
    }

    public int gcd(int a, int b) {
        while(b != 0){
            int temp = a % b ;
            a = b ;
            b = temp ;
        }
        return a ;
    }
}