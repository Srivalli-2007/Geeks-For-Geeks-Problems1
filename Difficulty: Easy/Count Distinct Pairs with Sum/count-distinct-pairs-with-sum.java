import java.util.*;

class Solution {
    static int countDistinctPairs(int arr[], int target) {

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> pairs = new HashSet<>();

        int count = 0;

        for(int x : arr) {

            int y = target - x;

            if(seen.contains(y)) {

                int a = Math.min(x, y);
                int b = Math.max(x, y);

                int key = a * 31 + b;

                if(!pairs.contains(key)) {
                    count++;
                    pairs.add(key);
                }
            }

            seen.add(x);
        }

        return count;
    }
}