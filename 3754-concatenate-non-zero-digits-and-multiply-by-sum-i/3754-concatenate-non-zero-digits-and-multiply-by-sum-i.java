class Solution {
    public long sumAndMultiply(int n) {
        
        long sum = 0;
        long digit_sum = 0;

        while(n > 0){
            long temp = n % 10;
            if(temp != 0){
                sum = sum * 10 + temp;
                digit_sum += temp;
            }
            n = n / 10;
        }

        long ans = 0;
        while(sum > 0){
            long temp = sum % 10;
            ans = ans * 10 + temp;
            sum /= 10;
        }

        return ans * digit_sum;
    }
}