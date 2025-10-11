// Last updated: 10/11/2025, 5:37:39 PM
class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for(Map.Entry<Integer,Integer> mp:map.entrySet()){
            pq.add(mp);
            if(pq.size()>k) pq.poll();
        }
        int res[]=new int [k];
        int i=0;
        while(!pq.isEmpty()){
            res[i++]=pq.poll().getKey();
        }
        return res;
    }
}
