class Solution{
    public int minEatingSpeed(int[] piles, int h){
        int i = 1 ; 
        int j = 0 ; 
        
        for(int p : piles){
            j = Math.max(j, p) ; 
        }
        
        int res = j ; 
        
        while(i <= j){
            int mid = i + (j - i) / 2 ; 
            long tH = 0 ; 
            
            for(int p : piles){
                tH += (p + mid - 1) / mid ;  
            }
            
            if (tH <= h){
                res = mid ; 
                j = mid - 1 ; 
            }
            else{
                i = mid + 1 ; 
            }
        }        
        return res ; 
    }
}   