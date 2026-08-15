class Solution {
    public int[] decimalRepresentation(int n) {
        ArrayList<Integer> list = new ArrayList<>() ;
        int place = 1 ;

        while(n > 0){
            int digit = n % 10 ;
            if(digit != 0){
                list.add(0 , digit * place) ;
            }
            n /= 10 ;
            place *= 10 ;
        }
        int[] ans = new int[list.size()] ;
        for(int i = 0 ; i < list.size() ; i++){
            ans[i] = list.get(i) ;
        }
        return ans ;
    }
}