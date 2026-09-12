class Solution {
    public String[] splitString(String s) {
        String letters = "", digits = "", special = "";
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c))
                letters += c;
            else if (Character.isDigit(c))
                digits += c;
            else
                special += c;
        }

        return new String[] {
            letters.isEmpty() ? "-1" : letters,
            digits.isEmpty() ? "-1" : digits,
            special.isEmpty() ? "-1" : special
        };
    }
}