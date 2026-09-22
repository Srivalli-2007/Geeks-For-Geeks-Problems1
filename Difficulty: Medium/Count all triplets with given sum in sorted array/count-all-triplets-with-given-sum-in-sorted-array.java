class Solution {
    public int countTriplets(int[] arr, int target) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) {
                    if (arr[left] == arr[right]) {
                        int len = right - left + 1;
                        count += (len * (len - 1)) / 2;
                        break;
                    }
                    int leftCount = 1;
                    while (left + leftCount < right &&
                           arr[left] == arr[left + leftCount]) {
                        leftCount++;
                    }
                    int rightCount = 1;
                    while (right - rightCount > left &&
                           arr[right] == arr[right - rightCount]) {
                        rightCount++;
                    }
                    count += leftCount * rightCount;
                    left += leftCount;
                    right -= rightCount;
                }
                else if (sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return count;
    }
}