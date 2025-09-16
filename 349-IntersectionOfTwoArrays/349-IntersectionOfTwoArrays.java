// Last updated: 9/16/2025, 9:33:11 AM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //step1 make hashet for num1
        Set<Integer> set=new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        //step2 make hashset for num2
        Set<Integer> result=new HashSet<>();
        for(int i:nums2){
            if(set.contains(i)){
                result.add(i);
            }
        }
        //step 3 set to array
        int arr[]=new int[result.size()];
        int i=0;
        for(int j:result)
        {
            arr[i++]=j;
        }
        return arr;
    }
}