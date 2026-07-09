class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int max = 0;

        while(low < high){

            int area = 0;
            if(height[low] <= height[high]){
                area = height[low] * ((high - low));
                low++;
            }else{
                area = height[high] * ((high - low));
                high--;
            }
            max = Math.max(max, area);
        }

        return max;
    }
}