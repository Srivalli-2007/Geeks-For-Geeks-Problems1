class Solution {
    static boolean check_duck(String num) {
        // code here
        return num.charAt(0) != '0' && num.contains("0");
    }
}