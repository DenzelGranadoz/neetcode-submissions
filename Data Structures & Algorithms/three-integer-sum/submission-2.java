class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(i != 0 && nums[i] == nums[i-1]) continue;

            int l = i + 1, r = n - 1;
            while(l < r) {
                int sum = nums[l] + nums[r] + nums[i];

                if(sum > 0) {
                    r--;
                } else if (sum < 0) {
                    l++;
                } else if (sum == 0) {
                    Integer[] a = {nums[i], nums[l], nums[r]};
                    list.add(Arrays.asList(a));
                    l++;
                    r--;
                    while(l < r && nums[l] == nums[l-1]) {
                        l++;
                    }

                    while(l < r && nums[r] == nums[r+1]) {
                        r--;
                    }
                }
            } 
        }
        return list;
    }
}
            