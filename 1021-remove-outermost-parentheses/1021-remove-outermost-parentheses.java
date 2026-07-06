class Solution {
    public String removeOuterParentheses(String s) {
        
        Stack<Character> s1 = new Stack<>();
        char[] arr = new char[s.length()];
        int index = 0;

        for(char ch : s.toCharArray()){

            if(ch == '('){

                if(!s1.isEmpty()){
                    arr[index++] = ch;
                }

                s1.push(ch);
            }
            else{

                s1.pop();

                if(!s1.isEmpty()){
                    arr[index++] = ch;
                }
            }
        }

        return new String(arr, 0 , index);
    }
}