import java.util.*;

class Solution {
    int countPairs(int arr[], int target) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        int count = 0;

        for(int i = 0; i < arr.length; i++) {

            int required = target - arr[i];

            if(hm.containsKey(required)) {
                count += hm.get(required);
            }

            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        return count;
    }
}