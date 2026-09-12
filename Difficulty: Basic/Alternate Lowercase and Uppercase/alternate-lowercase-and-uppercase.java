class Solution {
    public String altCase(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (Character.isUpperCase(s.charAt(0))) {
                    ans += Character.toUpperCase(s.charAt(i));
                } else {
                    ans += Character.toLowerCase(s.charAt(i));
                }
            } else {
                if (Character.isUpperCase(s.charAt(0))) {
                    ans += Character.toLowerCase(s.charAt(i));
                } else {
                    ans += Character.toUpperCase(s.charAt(i));
                }
            }
        }
        return ans;
    }
}