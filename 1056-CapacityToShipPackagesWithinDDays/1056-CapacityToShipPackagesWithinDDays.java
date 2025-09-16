// Last updated: 9/16/2025, 9:32:40 AM
class Solution {
    public int shipWithinDays(int[] nums, int k) {
        int l = 0, h = 0;

        // l = max element, h = sum of all elements
        for (int num : nums) {
            l = Math.max(l, num);
            h += num;
        }

        int ans = h; // initialize with max possible sum

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (canSplit(nums, k, mid)) {
                ans = mid;   // possible, try smaller max sum
                h = mid - 1;
            } else {
                l = mid + 1; // not possible, need bigger max sum
            }
        }
        return ans;
    }
    public static boolean canSplit(int[] arr, int k, int max) {
        int count = 1; // at least one subarray
        int sum = 0;

        for (int i : arr) {
            if (sum + i > max) {
                count++;
                sum = i;
                if (count > k) return false; // too many parts
            } else {
                sum += i;
            }
        }
        return true; // successfully split into <= k parts
    }
}