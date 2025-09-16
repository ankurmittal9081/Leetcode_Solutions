// Last updated: 9/16/2025, 9:33:41 AM
class Solution {
    public int findKthLargest(int[] arr, int k) {
      
       PriorityQueue<Integer> pq=new PriorityQueue<>();
       for(int i:arr){
        pq.add(i);
        if(pq.size()>k){
            pq.poll();
        }
       }
       return pq.poll();

    }
}
