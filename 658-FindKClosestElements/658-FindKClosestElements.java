// Last updated: 9/16/2025, 9:32:58 AM
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        PriorityQueue<int []> pq=new PriorityQueue<>((a,b)->a[0]==b[0]? b[1]-a[1]:b[0]-a[0]);

        
        ArrayList<Integer> l=new ArrayList<>();
        for(int i:arr){
                int dis=Math.abs(i-x);
                pq.add(new int []{dis,i});
                if(pq.size()>k){
                    pq.poll();
                }            
        }
        while(pq.size()>0){
            l.add(pq.poll()[1]);
        }
        Collections.sort(l);
        return l;

        
    }
}