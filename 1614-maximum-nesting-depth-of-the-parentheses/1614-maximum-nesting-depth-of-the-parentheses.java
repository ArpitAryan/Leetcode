class Solution {
    public int maxDepth(String s) {
        int counter = 0;
        int max_counter = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                counter++;
            }else if(ch == ')'){
                counter--;
            }

            max_counter = Math.max(max_counter, counter);
        }

        return max_counter;
    }
}