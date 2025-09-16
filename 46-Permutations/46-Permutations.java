// Last updated: 9/16/2025, 9:34:36 AM
class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> set = new ArrayList<>();
        permute(nums,0,set);
        return set;
        
    }
    static void permute(int[] nums,int fi, List<List<Integer>> set){
        if (fi==nums.length) { 
            List<Integer> temp=new ArrayList<>();
            for(int num:nums) {
                temp.add(num);
            }
            set.add(new ArrayList<>(temp)); 
            // set.add(new ArrayList<>(Arrays.stream(nums).boxed().toList()));

            return;
        }
        for(int i=fi;i<nums.length;i++){
            swap(nums,i,fi);
            permute(nums,fi+1,set);
            swap(nums,i,fi);
        }
    }
    static void swap(int[] nums,int i,int fi){
        
    int temp=nums[i];
    nums[i]=nums[fi];
    nums[fi]=temp;
    }
}