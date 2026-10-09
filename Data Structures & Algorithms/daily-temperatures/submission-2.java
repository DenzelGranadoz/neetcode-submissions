class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];

        for(int i = 0; i < n; i++) {
            int temp = temperatures[i];
            int count = 1;

            for(int j = i + 1; j < n; j++) {
                int currTemp = temperatures[j];
                if(temp >= currTemp) {
                    count++;
                }
                if(temp < currTemp) {
                    res[i] = count;
                    break;
                }
            }
        }
        return res;
    }
}
