// Last updated: 10/13/2025, 10:18:54 PM
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int k) {
        int n = capacity.length;
        int[] diff = new int[n];
        for (int i = 0; i < n; i++) diff[i] = capacity[i] - rocks[i];
        Arrays.sort(diff);

        int full = 0;
        for (int d : diff) {
            if (k >= d) 
            {

                     k -= d;
            full++;
            }   
        }
        return full;
    }
}
