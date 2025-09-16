// Last updated: 9/16/2025, 9:34:43 AM
class Solution {
    public int removeElement(int[] nums, int val) {
        int c = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[c] = nums[i]; 
                c++;
            }
        }
        return c; 
    }
}
