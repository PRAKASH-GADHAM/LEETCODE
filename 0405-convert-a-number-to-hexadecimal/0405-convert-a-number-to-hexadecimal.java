class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        
        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();

        while (num != 0) {
            int nibble = num & 0xF;
            sb.append(hexChars[nibble]);
            num >>>= 4;
        }
        return sb.reverse().toString();
    }
}   