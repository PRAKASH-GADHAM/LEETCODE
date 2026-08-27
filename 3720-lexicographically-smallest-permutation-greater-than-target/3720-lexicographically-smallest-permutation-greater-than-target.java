class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length() ;
        int[] freq = new int[26] ;

        for(char ch : s.toCharArray()){
            freq[ch - 'a']++ ;
        }

        StringBuilder ans = new StringBuilder() ;

        for(int i = 0 ; i < n ; i++){
            int current = target.charAt(i) - 'a' ;

            if(freq[current] > 0){
                ans.append(target.charAt(i)) ;
                freq[current]-- ;
            } 
            else{
                for(int j = current + 1 ; j < 26 ; j++){
                    if(freq[j] > 0){
                        ans.append((char) ('a' + j)) ;
                        freq[j]-- ;

                        for(int k = 0 ; k < 26 ; k++){
                            while(freq[k] > 0){
                                ans.append((char) ('a' + k)) ;
                                freq[k]-- ;
                            }
                        }
                        return ans.toString() ;
                    }
                }
                break ;
            }
        }

        for(int i = ans.length() - 1 ; i >= 0 ; i--){
            int current = ans.charAt(i) - 'a' ;
            freq[current]++ ;

            for(int j = current + 1 ; j < 26 ; j++){
                if(freq[j] > 0){
                    StringBuilder result = new StringBuilder(ans.substring(0, i)) ;
                    result.append((char) ('a' + j)) ;
                    freq[j]-- ;

                    for(int k = 0 ; k < 26 ; k++){
                        while(freq[k] > 0){
                            result.append((char) ('a' + k)) ;
                            freq[k]-- ;
                        }
                    }

                    return result.toString() ;
                }
            }
        }
        return "" ;
    }
}