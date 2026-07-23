class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        TreeMap<String, Integer> map = new TreeMap<>();

        // Count frequency
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                int val = map.get(words[i]);
                map.put(words[i], val + 1);
            } else {
                map.put(words[i], 1);
            }
        }

        List<String> ans = new ArrayList<>();

        while (k > 0) {

            String maxWord = "";
            int maxFreq = -1;

            for (String word : map.keySet()) {

                if (map.get(word) > maxFreq) {
                    maxFreq = map.get(word);
                    maxWord = word;
                }
            }

            ans.add(maxWord);

            
            map.remove(maxWord);

            k--;
        }

        return ans;
    }
}