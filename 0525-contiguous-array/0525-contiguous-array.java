class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length ;
        int[] map = new int[2 * n + 1] ;
        
        for(int i = 0 ; i < map.length ; i++){
            map[i] = -2 ;
        }
        
        map[n] = -1 ;
        int maxLen = 0 ;
        int sum = 0 ;
        
        for(int i = 0 ; i < n ; i++){
            sum += (nums[i] == 0 ? -1 : 1) ;
            if(map[sum + n] != -2){
                int len = i - map[sum + n];
                if(len > maxLen){
                    maxLen = len ;
                }
            } 
            else{
                map[sum + n] = i ;
            }
        }
        return maxLen ;
    }
}   