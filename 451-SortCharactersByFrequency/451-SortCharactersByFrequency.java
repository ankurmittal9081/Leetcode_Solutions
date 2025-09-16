// Last updated: 9/16/2025, 9:33:05 AM
class Solution {
    public String frequencySort(String s) {

        HashMap<Character,Integer> map=new HashMap<>();
        for(char w:s.toCharArray()){
            map.put(w,map.getOrDefault(w,0)+1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq=new PriorityQueue
        <>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(map.entrySet());

       StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            for (int i = 0; i < entry.getValue(); i++) {
                sb.append(entry.getKey());
            }
        }

        return sb.toString();

    }
}