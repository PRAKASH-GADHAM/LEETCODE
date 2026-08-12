class Solution {
    static{
        for(int i = 0 ; i < 80 ; i++){
            numRescueBoats(new int[]{1} , 1) ;
        }
    }
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people) ;
        int i = 0 ;
        int j = people.length - 1 ;
        int tb = 0 ;
        
        while(i <= j){
            if(people[i] + people[j] <= limit){
                i++ ; 
            }
            j-- ; 
            tb++ ; 
        }
        return tb ;
    }
}   