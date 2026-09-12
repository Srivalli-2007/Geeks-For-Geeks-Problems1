class Solution {
    public static String missingPanagram(String s) {
        boolean[] present = new boolean[26];

        for (char c : s.toLowerCase().toCharArray())
            if (c >= 'a' && c <= 'z')
                present[c - 'a'] = true;

        String ans = "";

        for (int i = 0; i < 26; i++)
            if (!present[i])
                ans += (char)('a' + i);

        return ans.length() == 0 ? "-1" : ans;
    }
}