// Last updated: 9/16/2025, 9:32:33 AM
class Solution {
    public int[] frequencySort(int[] arr) {
         // add your code here
        HashMap<Integer,Integer> map=new HashMap<>();
         
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

       PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> (a[1] == b[1]) ? (b[0] - a[0]) : (a[1] - b[1])
        );
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(new int[]{entry.getKey(), entry.getValue()});
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int num = cur[0], freq = cur[1];
            for (int i = 0; i < freq; i++) {
                result.add(num);
            }
        }

         int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;

        
    }
}