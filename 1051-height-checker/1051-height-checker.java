class Solution {
    public int heightChecker(int[] heights) {
        
        int n = heights.length;
        int[] expected = new int[heights.length];

        int max = 0;
        for(int i = 0; i < n; i++){
            if(heights[i] > max){
                max = heights[i];
            }
        }

        int[] count = new int[max + 1];
        for(int i = 0; i < heights.length; i++){
            count[heights[i]]++;
        }

        for(int i = 1; i <= max; i++){
            count[i] = count[i] + count[i - 1];
        }

        for(int i = heights.length - 1; i >= 0; i--){
            int temp = heights[i];
            expected[count[temp] - 1] = temp;
            count[temp]--;
        }

        int ans = 0;
        for(int i = 0; i < expected.length; i++){
            if(heights[i] != expected[i]){
                ans++;
            }
        }

        return ans;
    }
}