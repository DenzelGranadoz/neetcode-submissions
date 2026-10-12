class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int l = 0, r = 0;
        int longest = 0;

        for(int i = 0; i < s.length(); i++) {
            while(set.contains(s.charAt(i))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(i));
            longest = Math.max(longest, r - l + 1);
            r++;
        }

        return longest;
    }
}

