// Last updated: 9/16/2025, 9:34:02 AM
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict); // Faster lookup
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true; // Empty string can always be segmented

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }
}
