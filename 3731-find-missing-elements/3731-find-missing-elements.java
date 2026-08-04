class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int lowest = Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < lowest){
                lowest = nums[i];
            }

            if(nums[i] > highest){
                highest = nums[i];
            }
        }

        for(int i = lowest; i <= highest; i++){
            if(!map.containsKey(i)){
                ans.add(i);
            }
        }

        return ans;
        
    }
}