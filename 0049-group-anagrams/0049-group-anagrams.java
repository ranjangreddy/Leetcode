class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hash = new HashMap<>();
        for(String s: strs){
            int[] freq = new int[26];
            for(char c: s.toCharArray()){
                freq[c-'a']++;
            }
            String key = Arrays.toString(freq);
            if (!hash.containsKey(key)) {
                hash.put(key, new ArrayList<>());
            }
            hash.get(key).add(s);
        }
        return new ArrayList<>(hash.values());
    }
}