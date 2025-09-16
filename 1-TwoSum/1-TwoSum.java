// Last updated: 9/16/2025, 9:34:52 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Arrays.sort(nums);
        
        int n=nums.length;
        // int l=0;
        // int r=n-1;

        // while(l<r)
        // {
        //     int sum=nums[l]+nums[r];
        //     if(sum==target)
        //     {
        //         return new int[]{l,r};

        //     }
        //     else if(sum>target)
        //     {
            
        //         r--;
        //     }   
        //     else
        //     {
        //         l++;
        //     }
        // }
        // return new int[]{-1,-1};
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<n;i++)
    {

        int c=target-nums[i];
        if(map.containsKey(c)){
            return new int[]{map.get(c), i};
        }
        map.put(nums[i],i);


        
    }

    return new int[]{-1,-1};
        
    }
}