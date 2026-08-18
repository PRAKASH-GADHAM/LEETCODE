class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length ;

        if(k == 1){
            int[] freq = new int[51] ;

            for(int num : nums){
                freq[num]++ ;
            }

            int largest = -1 ;

            for(int num : nums){
                if(freq[num] == 1){
                    largest = Math.max(largest, num) ;
                }
            }

            return largest ;
        }

        if(k == n){
            int largest = 0 ;

            for(int num : nums){
                largest = Math.max(largest, num) ;
            }
            return largest ;
        }

        int largest = -1 ;
        int[] freq = new int[51] ;

        for(int num : nums){
            freq[num]++ ;
        }

        if(freq[nums[0]] == 1){
            largest = Math.max(largest, nums[0]) ; 
        }
        if(freq[nums[n - 1]] == 1){
            largest = Math.max(largest, nums[n - 1]) ;
        }
        return largest ;
    }
}