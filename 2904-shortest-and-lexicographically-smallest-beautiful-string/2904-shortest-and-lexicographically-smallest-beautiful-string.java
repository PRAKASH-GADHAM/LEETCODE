class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left = 0 ;
        
        while(left < s.length()){
            if(s.charAt(left) == '1'){
                break ;
            }
            left++ ;
        }

        if(left >= s.length()) return "" ;

        int total_count1 = 0 ;

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '1'){
                total_count1++ ;
            }
        }

        if(total_count1 < k) return "" ;

        int right = left ;
        List<List<Integer>> longest = new ArrayList<>() ;
        int count1 = 0 ;

        while(right < s.length()){
            if(s.charAt(right) == '1') count1++ ;
            
            if(count1 == k){
                List<Integer> arr = new ArrayList<>(Arrays.asList(right - left + 1 , left , right)) ;
                longest.add(arr) ;
                left++ ;
                count1-- ;
                while(left < right && s.charAt(left) == '0') left++ ;
            }
            right++ ;
        }

        if (longest.isEmpty()) return "" ;

        int longer = Integer.MAX_VALUE ;
        int index = 0 ;
        int j = 0 ;
        
        for(List<Integer> list : longest){
            if(list.get(0) < longer){
                longer = list.get(0) ;
                index = j ;
            }
            else if(list.get(0) == longer){
                String current = s.substring(longest.get(index).get(1) , longest.get(index).get(2) + 1) ;
                String candidate = s.substring(list.get(1) , list.get(2) + 1) ;
                if(candidate.compareTo(current) < 0) index = j ;
            }
            j++ ;
        }
        return s.substring(longest.get(index).get(1) , longest.get(index).get(2) + 1) ;
    }
}