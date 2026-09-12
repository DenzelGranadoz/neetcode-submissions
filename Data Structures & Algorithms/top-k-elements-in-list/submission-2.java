class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        List<Integer>[] freqList = new List[nums.length + 1];

        for(int i = 0; i < freqList.length; i++) {
            freqList[i] = new ArrayList<>();
        }

        for (int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            freqList[entry.getValue()].add(entry.getKey());
        }

        int[] output = new int[k];
        int idx = 0;

        for(int i = freqList.length - 1; i > 0 && idx < k; i--) {
            for(int n : freqList[i]) {
                output[idx++] = n;
                if (idx == k) {
                    return output;
                }
            }
        }
        return output;
    }
}

