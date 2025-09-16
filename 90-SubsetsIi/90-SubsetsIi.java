// Last updated: 9/16/2025, 9:34:16 AM
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // sort to handle duplicates
        backtrack(nums, 0, new ArrayList<>());
        return result;
    }
    private void backtrack(int[] nums, int index, List<Integer> current) {
        result.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue;

            current.add(nums[i]);
            backtrack(nums, i + 1, current);
            current.remove(current.size() - 1); // backtrack
        }
    }
}
