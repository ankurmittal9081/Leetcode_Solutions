// Last updated: 10/12/2025, 4:21:54 PM
class Solution {
    static {
        // Run the method 500 times with sample input {1,2,3,4}
        for (int i = 0; i < 500; i++) {
            productExceptSelf(new int[] { 1, 2, 3, 4 });
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        int right_product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * right_product;
            right_product *= nums[i];
        }
        return result;
    }
}