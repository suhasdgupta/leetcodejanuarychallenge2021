class GetMaximumInGeneratedArray {
    public int getMaximumGenerated(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int[] nums = new int[n + 1];
        nums[0] = 0; nums[1] = 1;
        int res = 0;
        for (int i=0; i<n+1; i++) {
            if (2 * i < n + 1) {
                nums[2 * i] = nums[i];
            } 
            if (2 * i + 1 < n + 1) {
                nums[2 * i + 1] = nums[i] + nums[i + 1];
            } 
        }
        for (int i=0; i<n+1; i++) {
            res = Math.max(res, nums[i]);
        }
        return res;
    }
}
