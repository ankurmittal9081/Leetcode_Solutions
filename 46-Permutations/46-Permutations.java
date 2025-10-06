// Last updated: 10/6/2025, 6:48:29 PM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>  l=new ArrayList<>();
        solve(nums,0,l);
        return l;
    }
    public static void solve(int arr[],int index,List<List<Integer>> l){
        if(index==arr.length) {
            List<Integer> temp=new ArrayList<>();
            for(int num:arr){
                temp.add(num);
            }

            l.add(new ArrayList<>(temp));
            return;
        }

        for(int i=index;i<arr.length;i++){
            swap(arr,i,index);
            solve(arr,index+1,l);
            swap(arr,i,index);
        }
    }

    public static void swap(int arr[],int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        
    }
}