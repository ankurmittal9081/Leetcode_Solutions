// Last updated: 10/18/2025, 11:15:06 PM
class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = getValue(s.charAt(i));
            if (i + 1 < s.length() && val < getValue(s.charAt(i + 1))) ans -= val;
            else ans += val;
        }
        return ans;
    }

    int getValue(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        return 1000;
    }
}
