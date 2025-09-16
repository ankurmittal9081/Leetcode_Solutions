// Last updated: 9/16/2025, 9:32:46 AM
class Solution {
   public boolean canFinishEating(int[] piles, int h, int k) {
        int hoursUsed = 0;
        for (int p : piles) {
            hoursUsed += Math.ceil((double) p / k);  // Use Math.ceil() for rounding up
        }
        return hoursUsed <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 1000000000;  // 10^9 max length of the piles
        int ans = -1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (canFinishEating(piles, h, mid)) {
                ans = mid;
                right = mid - 1;  // Try to find a smaller k
            } else {
                left = mid + 1;  // Increase the speed to finish within h hours
            }
        }
        return ans;
    }
}