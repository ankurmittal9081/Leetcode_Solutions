// Last updated: 10/15/2025, 10:21:31 PM
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums); // sort to use two-pointer efficiently
        
        for (int i = 0; i < n - 2; i++) {
            // skip duplicates for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1, r = n - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;

                    // skip duplicates for l and r
                    while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r && nums[r] == nums[r + 1]) r--;
                } 
                else if (sum < 0) {
                    l++;
                } 
                else {
                    r--;
                }
            }
        }

        return res;
    }
}
