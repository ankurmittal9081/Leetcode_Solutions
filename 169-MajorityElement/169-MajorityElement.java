// Last updated: 9/16/2025, 9:33:45 AM

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
