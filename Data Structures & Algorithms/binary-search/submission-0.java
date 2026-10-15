class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length-1;

        while(l<=r) {
            int middle = l+((r-l)/2);
            if(target < nums[middle]) {
                r = middle-1;
            } else if (target > nums[middle]) {
                l = middle+1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}
