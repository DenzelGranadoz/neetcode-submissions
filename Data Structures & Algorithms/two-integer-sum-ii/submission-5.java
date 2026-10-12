class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, n = numbers.length - 1, r = n;

        while(l < r) {
            int sum = numbers[l] + numbers[r];

            if(sum < target) {
                l++;
            } else if (sum > target) {
                r--;
            } else if (sum == target) {
                return new int[]{l+1, r+1};
            }
        }
        return new int[]{};
    }
}

