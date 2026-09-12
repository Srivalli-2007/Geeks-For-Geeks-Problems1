class Solution {
    public boolean halvesMatch(String s) {
        int n = s.length();
        int mid = n / 2;

        int[] first = new int[26];
        int[] second = new int[26];

        // Count first half
        for (int i = 0; i < mid; i++) {
            first[s.charAt(i) - 'a']++;
        }

        // Count second half
        int start = (n % 2 == 0) ? mid : mid + 1;

        for (int i = start; i < n; i++) {
            second[s.charAt(i) - 'a']++;
        }

        // Compare frequencies
        for (int i = 0; i < 26; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }

        return true;
    }
}