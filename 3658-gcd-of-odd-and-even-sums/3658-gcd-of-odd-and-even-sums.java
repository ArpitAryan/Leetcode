class Solution {
    public int gcdOfOddEvenSums(int n) {
        long sumOdd = n*n;
        long sumEven = n*(n+1);

        return gcd(sumOdd, sumEven);
    }

    public int gcd(long sumOdd, long sumEven){
        if(sumEven == 0){
            return (int) sumOdd;
        }

        return gcd(sumEven, sumOdd % sumEven);
    }
}