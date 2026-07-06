class Solution {
    public int[] transformArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                nums[i] = 0;
            }else{
                nums[i] = 1;
            }
        }

        while(left < right){

            while(left < right && nums[left] == 0){
                left++;
            }

            while(left < right && nums[right] == 1){
                right--;
            }

            if(left < right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

        return nums;
    }
}