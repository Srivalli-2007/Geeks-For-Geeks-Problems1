class Solution {
    public String sandwichedVowel(String s) {
        // code here
        return s.replaceAll("(?<=[^aeiou])[aeiou](?=[^aeiou])", "");
    }
}