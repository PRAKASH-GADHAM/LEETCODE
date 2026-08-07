class Solution{
    int[] primes ={2, 3, 5, 7} ;
    int maxPrime = 7 ;

    public String smallestNumber(String num, long t){
        int[] primeCount = new int[maxPrime + 1] ;
        int n = num.length() ;
        int firstZero = 0 ;

        for(int p : primes){
            while(t % p == 0){
                t /= p ;
                primeCount[p]++ ;
            }
        }

        if(t != 1){
            return "-1" ;
        }

        int minLen = getMinLength(primeCount) ;

        if(n < minLen){
            return buildSuffix(primeCount, minLen, new char[minLen]) ;
        }

        char[] ans = new char[n + 1] ;

        for(int i = 0 ; firstZero < n && (ans[++i] = num.charAt(firstZero)) != '0' ;firstZero++){
            logNum(primeCount, ans[i], -1) ;
        }

        if(getMinLength(primeCount) == 0){
            if(firstZero == n){
                return num ;
            }
            Arrays.fill(ans, ++firstZero, ans.length, '1') ;
            return new String(ans, 1, n) ;
        }

        for(int last = n - 1, end = Math.min(firstZero, last) ; end >= 0 ; end--){

            logNum(primeCount, ans[end + 1], 1) ;

            while(++ans[end + 1] <= '9'){

                logNum(primeCount, ans[end + 1], -1) ;

                if(getMinLength(primeCount) <= last - end){
                    return buildSuffix(primeCount, last - end, ans) ;
                }

                logNum(primeCount, ans[end + 1], 1) ;
            }
        }

        return buildSuffix(primeCount, ans.length, ans) ;
    }

    void logNum(int[] primeCount, int digit, int delta){

        if(digit < '2') return ;

        switch (digit){
            case '4':
                primeCount[2] += delta * 2 ;
                break ;

            case '6':
                primeCount[2] += delta ;
                primeCount[3] += delta ;
                break ;

            case '8':
                primeCount[2] += delta * 3 ;
                break ;

            case '9':
                primeCount[3] += delta * 2 ;
                break ;

            default:
                primeCount[digit - '0'] += delta ;
        }
    }

    String buildSuffix(int[] primeCount, int targetLength, char[] ans){

        int idx = ans.length ;

        while(primeCount[3] > 1){
            primeCount[3] -= 2 ;
            ans[--idx] = '9' ;
        }

        while(primeCount[2] > 2){
            primeCount[2] -= 3 ;
            ans[--idx] = '8' ;
        }

        while(primeCount[7]-- > 0){
            ans[--idx] = '7' ;
        }

        if(primeCount[2] > 0 && primeCount[3] > 0){
            ans[--idx] = '6' ;
            primeCount[2]-- ;
            primeCount[3]-- ;
        }

        while(primeCount[5]-- > 0){
            ans[--idx] = '5' ;
        }

        while(primeCount[2] > 1){
            primeCount[2] -= 2 ;
            ans[--idx] = '4' ;
        }

        while(primeCount[3] > 0){
            primeCount[3]-- ;
            ans[--idx] = '3' ;
        }

        while(primeCount[2] > 0){
            primeCount[2]-- ;
            ans[--idx] = '2' ;
        }

        while(idx + targetLength != ans.length){
            ans[--idx] = '1' ;
        }

        if(targetLength == ans.length){
            return new String(ans) ;
        }

        return new String(ans, 1, ans.length - 1) ;
    }

    int getMinLength(int[] primeCount){

        int c2 = primeCount[2] > 0 ? primeCount[2] : 0 ;
        int c3 = primeCount[3] > 0 ? primeCount[3] : 0 ;

        int rem = (c3 & 1) + (c2 % 3) ;

        return (c3 >> 1)
                + (c2 / 3)
                + (primeCount[5] > 0 ? primeCount[5] : 0)
                + (primeCount[7] > 0 ? primeCount[7] : 0)
                + (rem == 3 ? 2 : rem > 0 ? 1 : 0) ;
    }
}