class Solution {
    public String extractMessage(String s) {
        String ans = s.replace("LIE", " ");
        return ans.trim().replaceAll(" +", " ");
    }
}