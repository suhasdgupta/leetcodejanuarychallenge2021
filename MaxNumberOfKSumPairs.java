class MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int n : nums) {
            map.put(n, 1 + map.getOrDefault(n, 0));
        }
        for (int key : map.keySet()) {
            if (key * 2 == k) {
                ans += map.get(key) / 2;
            }else if (map.containsKey(k - key)) {
                int min = Math.min(map.get(key), map.get(k - key));
                ans += min;
                map.put(key, map.get(key) - min);
                map.put(k - key, map.get(k - key) - min);
            }
        }
        return ans;
    }
}
