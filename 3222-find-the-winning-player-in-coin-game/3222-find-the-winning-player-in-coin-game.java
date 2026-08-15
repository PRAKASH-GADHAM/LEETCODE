class Solution {
    public String winningPlayer(int x, int y) {
        int res = Math.min(x , y / 4) ;
        return (res % 2 == 1) ? "Alice" : "Bob" ;
    }
}