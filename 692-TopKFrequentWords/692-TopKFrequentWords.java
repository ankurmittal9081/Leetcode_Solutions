// Last updated: 9/16/2025, 9:32:56 AM
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        LinkedList<String> result = new LinkedList<>();

        for (String word : words)
            map.put(word, map.getOrDefault(word, 0) + 1);

        PriorityQueue<String> pq = new PriorityQueue<>(
                (a, b) -> map.get(a) - map.get(b) == 0 ? b.compareTo(a) : map.get(a) - map.get(b));

        for (String word : map.keySet()) {
            pq.add(word);
            if (pq.size() > k)
                pq.poll();
        }
        // System.out.println(pq);
        while (!pq.isEmpty())
            result.addFirst(pq.poll());

        return result;
    }
}