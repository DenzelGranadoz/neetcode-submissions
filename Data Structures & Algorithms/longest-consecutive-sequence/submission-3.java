class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int longestConsecutive = 0;

        for(int i = 0; i < nums.length; i++) {
            int currNum = nums[i];
            if (!set.contains(currNum - 1)) {
                int currLength = 1;
                while(set.contains(currNum+1)) {
                    currNum++;
                    currLength++;
                }
                longestConsecutive = Math.max(longestConsecutive, currLength);
            }
        }
        return longestConsecutive;
    }
}
