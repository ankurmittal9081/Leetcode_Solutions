// Last updated: 9/16/2025, 9:33:27 AM
class Solution {
    public int nthUglyNumber(int n) {
        Set<Long> set = new HashSet<>();
        PriorityQueue<Long> pq = new PriorityQueue<>();
        long factors[] = {2, 3, 5};

        pq.add(1L);
        set.add(1L);
        long ele = 1;

        for (int i = 0; i < n; i++) {
            ele = pq.poll();
            for (long factor : factors) {
                long next = ele * factor;
                if (!set.contains(next)) {
                    pq.add(next);
                    set.add(next);
                }
            }
        }
        return (int)ele;
        
    }
}