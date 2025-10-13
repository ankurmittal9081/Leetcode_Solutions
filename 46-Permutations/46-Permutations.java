// Last updated: 10/13/2025, 9:03:41 PM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>l=new ArrayList<>();
        solve(nums,0,l);
        return l;

    }

    public void solve(int arr[],int idx,List<List<Integer>>l){
        if(idx==arr.length){
            List<Integer> ll=new ArrayList<>();
            for(int i:arr)ll.add(i);
            l.add(new ArrayList<>(ll));
            return ;
        }
        for(int i=idx;i<arr.length;i++){
            swap(arr,i,idx);
            solve(arr,idx+1,l);
            swap(arr,i,idx);
        }
    }
    public void swap(int arr[],int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
}
