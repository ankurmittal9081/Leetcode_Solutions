// Last updated: 9/16/2025, 9:34:25 AM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int subsetCount = 1 << n; // 2^n subsets
        List<List<Integer>> subsets = new ArrayList<>();

        // Loop over all possible masks
        for (int mask = 0; mask < subsetCount; mask++) {
            List<Integer> subset = new ArrayList<>();

            // Check each bit of mask
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) { // if i-th bit is set
                    subset.add(nums[i]);
                }
            }

            subsets.add(subset);
        }

        return subsets;
        
    }
}