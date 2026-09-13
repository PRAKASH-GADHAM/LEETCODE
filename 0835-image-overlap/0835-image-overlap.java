class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length ;
        List<int[]> ones1 = new ArrayList<>() ;
        List<int[]> ones2 = new ArrayList<>() ;
        
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(img1[i][j] == 1) ones1.add(new int[]{i , j}) ;
                if(img2[i][j] == 1) ones2.add(new int[]{i , j}) ;
            }
        }

        Map<Integer , Integer> shiftCounts = new HashMap<>() ;
        int maxOverlap = 0 ;

        for(int[] p1 : ones1){
            for(int[] p2 : ones2){
                int dy = p2[0] - p1[0] ;
                int dx = p2[1] - p1[1] ;
                int key = (dy + 30) * 100 + (dx + 30) ;
                int count = shiftCounts.getOrDefault(key , 0) + 1 ;
                shiftCounts.put(key , count) ;
                maxOverlap = Math.max(maxOverlap , count) ;
            }
        }
        return maxOverlap ;
    }
}