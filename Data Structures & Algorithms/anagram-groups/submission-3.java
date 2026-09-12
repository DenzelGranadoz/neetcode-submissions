class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String s : strs) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sorted = new String(charArr);

            List<String> list = map.getOrDefault(sorted, new ArrayList<>());
            list.add(s);
            map.put(sorted, list);
        }

        return new ArrayList<>(map.values());
    }
}
