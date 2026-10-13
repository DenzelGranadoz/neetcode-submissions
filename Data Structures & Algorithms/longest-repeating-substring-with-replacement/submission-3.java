class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, r = 0;
        Map<Character, Integer> map = new HashMap<>();

        int longest = 0;
        int frequent = 0;
   
        while(r < s.length()) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            frequent = Math.max(frequent, map.get(s.charAt(r)));

            while((r-l+1) - frequent > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }

            longest = Math.max(longest, r-l+1);
            r++;
        }

        return longest;
    }
}