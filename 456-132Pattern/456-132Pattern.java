// Last updated: 10/10/2025, 3:32:46 PM
class Solution {
    public boolean find132pattern(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(nums[i]<max) return true;
            while(!st.isEmpty()&& nums[i]>st.peek()){
                max=st.pop();
            }
            st.push(nums[i]);
        }

        return false;
    }
}