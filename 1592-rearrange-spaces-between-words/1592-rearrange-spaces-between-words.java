class Solution {
    public String reorderSpaces(String text) {
        
        int count = 0;

        for(char ch : text.toCharArray()){
            if(ch == ' '){
                count += 1;
            }
        }

        String[] s = text.trim().split("\\s+");

        if(s.length == 1){
            StringBuilder ans = new StringBuilder(s[0]);
            for(int i = 0; i < count; i++){
                ans.append(' ');
            }
            return ans.toString();
        }

        int between = count/(s.length - 1);
        int extra = count%(s.length - 1);

        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < s.length; i++){
            ans.append(s[i]);

            if(i != s.length - 1){
                for(int j = 0; j < between; j++){
                    ans.append(' ');
                }
            }
        }

        for(int i = 0; i < extra; i++){
            ans.append(' ');
        }

        return ans.toString();
    }
}