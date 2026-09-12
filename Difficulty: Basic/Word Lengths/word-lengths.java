import java.util.*;
class Solution {
    ArrayList<Integer> wordLengths(String s) {
        ArrayList<Integer> ans = new ArrayList<>();
        String[] words = s.split(" ");
        for (String word : words) {
            ans.add(word.length());
        }

        return ans;
    }
}