import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // 1. SORTING IS MANDATORY
        Arrays.sort(people);
        
        int i = 0;
        int j = people.length - 1;
        int total_boats = 0;
        
        while (i <= j) {
            
            if (people[i] + people[j] <= limit) {
                i++; 
            }
            j--; 
            total_boats++; 
        }
        
        return total_boats;
    }
}   