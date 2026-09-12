class Solution {
    static String URLify(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                ans += "%20";
            } else {
                ans += s.charAt(i);
            }
        }
        return ans;
    }
}