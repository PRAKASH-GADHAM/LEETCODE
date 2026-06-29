class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a = (int) Math.pow(n , 2);
        int b = n*(n+1);
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
   return a; }
}