class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        TreeMap<String,Integer>map=new TreeMap<>();
        for(int i =0;i<words.length;i++){
            if(map.containsKey(words[i])){
                int val=map.get(words[i]);
                map.put(words[i],val+1);
            }else{
                map.put(words[i],1);
            }
        }
        List<String>ans=new ArrayList<>();
        while(k>0){
            String maxword="";
            int maxfreq=-1;
            for(String word:map.keySet()){
                if(map.get(word)>maxfreq){
                    maxword=word;
                    maxfreq=map.get(word);
                }else if(map.get(word) == maxfreq && word.compareTo(maxword) < 0){
                    maxword = word;
}
            }
            ans.add(maxword);
            map.remove(maxword);
            k--;
        }
        return ans;
    }
}