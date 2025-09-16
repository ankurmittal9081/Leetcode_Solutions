// Last updated: 9/16/2025, 9:33:33 AM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > nums.length / 3) {
                result.add(key);
            }
        }

        return result;
    }
}
