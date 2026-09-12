class Solution {
    public int countVowels(String s) {
        boolean a = false, e = false, i = false, o = false, u = false;
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (c == 'a') a = true;
            else if (c == 'e') e = true;
            else if (c == 'i') i = true;
            else if (c == 'o') o = true;
            else if (c == 'u') u = true;
        }
        int count = 0;
        if (a) count++;
        if (e) count++;
        if (i) count++;
        if (o) count++;
        if (u) count++;
        return count;
    }
}