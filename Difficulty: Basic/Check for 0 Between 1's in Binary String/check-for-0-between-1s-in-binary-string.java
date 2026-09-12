class Solution {
    public boolean checkBinary(String s) {
        boolean seenOne = false;
        boolean zeroAfterOne = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                if (zeroAfterOne) {
                    return false;
                }
                seenOne = true;
            } 
            else {
                if (seenOne) {
                    zeroAfterOne = true;
                }
            }
        }
        return true;
    }
}