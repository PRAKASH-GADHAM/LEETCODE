class Solution {
    public int countLargestGroup(int n) {
       int[] freq = new int[37] ;
       
       for(int i = 1 ; i <= n ; i++){
            int sum = 0 ;
            int temp = i ;
            
            while(temp > 0){
                sum += temp % 10 ;
                temp /= 10 ;
            }
            freq[sum]++ ;
       }

        int max = 0 ;
        int count = 0 ;

        for(int f : freq){
            if(f > max){
                max = f ;
                count = 1 ; 
            } 
            else if(f == max){
                count++ ;
            }
        }
        return count ;
    }
}