class Solution {
    public String triangleType(int[] nums) {
        int a = nums[0] ;
        int b = nums[1] ;
        int c = nums[2] ;
        
        if(!isTriangle(a , b , c)){
            return "none" ;
        }

        if(a == b && a == c && b == c){
            return "equilateral" ;
        }
        else if((a == b && b != c) || (b == c && c != a) || (a == c && c != b)){
            return "isosceles" ;
        }
        else if(a != b && a != c && b != c){
            return "scalene" ;
        }
        else{
            return "none" ;
        }
    }
    public boolean isTriangle(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c)) ;
        return a + b + c - max > max ;
    }
}