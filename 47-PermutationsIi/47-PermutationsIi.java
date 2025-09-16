// Last updated: 9/16/2025, 9:34:35 AM
import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        help(nums, 0, res);
        return res;
    }
    public static void help(int[] nums, int fi, List<List<Integer>> res) {
        if(fi==nums.length-1) {
            List<Integer>temp =new ArrayList<>();
            for (int num:nums)temp.add(num);
            res.add(temp); 
            return;
        }
        HashSet<Integer> map=new HashSet<>();
        for (int i = fi; i < nums.length; i++) {
            if (map.contains(nums[i])) continue; 
            map.add(nums[i]);

            swap(nums, fi, i);
            help(nums, fi + 1, res);
            swap(nums, fi, i);
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
