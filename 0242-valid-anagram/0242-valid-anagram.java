class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> ans=helper(s);
        HashMap<Character,Integer> res=helper(t);
        if(ans.equals(res)){
            return true;
        }
        return false;
        
    }

    public HashMap<Character,Integer> helper(String s){
        HashMap<Character,Integer> hm =new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        return hm;

    }
}