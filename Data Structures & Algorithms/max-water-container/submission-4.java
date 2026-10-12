class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int l = 0, r = heights.length - 1;

        while(l < r) {
            int smaller = heights[l] > heights[r] ? heights[r--] : heights[l++];
            maxArea = Math.max(maxArea, (r - l + 1) * smaller);
        }

        return maxArea;
    }
}
