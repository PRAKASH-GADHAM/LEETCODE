class Solution {
    public String removeDuplicates(String s, int k) {
        char[] stack = new char[s.length()] ;
        int[] counts = new int[s.length()] ;
        int top = -1 ;

        for(char ch : s.toCharArray()){
            stack[++top] = ch ;
            if (top >= 1 && stack[top] == stack[top - 1]){
                counts[top] = counts[top - 1] + 1 ;
            }
            else{
                counts[top] = 1 ;
            }

            if(counts[top] == k){
                top -= k ;
            }
        }
        return new String(stack , 0 , top + 1) ;  
    }
}