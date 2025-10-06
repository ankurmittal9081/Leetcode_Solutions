// Last updated: 10/6/2025, 6:27:36 PM
class Solution {
    public List<List<String>> partition(String s) {
        int n = s.length();
        // dp[i] = all partitions starting from index i
        List<List<List<String>>> dp = new ArrayList<>(n);
        for (int i = 0; i < n; i++) dp.add(null);
        return helper(0, s, dp);
    }

    private List<List<String>> helper(int start, String s, List<List<List<String>>> dp) {
        if (start == s.length()) {
            List<List<String>> base = new ArrayList<>();
            base.add(new ArrayList<>()); // empty partition
            return base;
        }

        if (dp.get(start) != null) return dp.get(start);

        List<List<String>> res = new ArrayList<>();
        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s, start, end)) {
                String prefix = s.substring(start, end + 1);
                for (List<String> suffixPartition : helper(end + 1, s, dp)) {
                    List<String> partition = new ArrayList<>();
                    partition.add(prefix);
                    partition.addAll(suffixPartition);
                    res.add(partition);
                }
            }
        }
        dp.set(start, res);
        return res;
    }

    private boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }
}
