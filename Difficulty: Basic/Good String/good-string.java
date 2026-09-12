class Solution {
    public boolean isGoodString(String s) {
        for (int i = 1; i < s.length(); i++) {
            int d = Math.abs(s.charAt(i) - s.charAt(i - 1));
            if (d != 1 && d != 25)
                return false;
        }
        return true;
    }
}