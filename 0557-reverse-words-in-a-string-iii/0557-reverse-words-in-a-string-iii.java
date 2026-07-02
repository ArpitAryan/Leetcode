class Solution {
    public String reverseWords(String s) {
        
        int start = 0;
        char[] arr = s.toCharArray();

        for(int end = 0; end <= arr.length; end++){
            if(end == arr.length || arr[end] == ' '){

                reverse(arr, start, end - 1);

                start = end + 1;
            }
        }
        return new String(arr);
    }

    public void reverse(char[] arr, int left, int right){

        while(left < right){

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}