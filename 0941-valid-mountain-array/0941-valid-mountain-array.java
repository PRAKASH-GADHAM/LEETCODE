class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false ;
        int pos = 1 ;
        if(arr[pos] <= arr[pos - 1]){
            return false ;
        }

        if(arr[pos] > arr[pos - 1]){
            while(pos < arr.length){
                if(arr[pos] < arr[pos - 1]) break ;
                else if(arr[pos] == arr[pos - 1]) return false ;
                pos++ ;
            }
            if(pos == arr.length) return false ;
        }

        while(pos < arr.length){
            if(arr[pos] >= arr[pos - 1]) return false ;
            pos++ ;
        }
        return true ;
    }
}