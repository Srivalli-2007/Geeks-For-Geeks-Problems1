class Solution {
    int countPairs(int arr[], int target) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int count = 0;
        while(left < right) {

            int sum = arr[left] + arr[right];

            if(sum < target) {
                left++;
            }
            else if(sum > target) {
                right--;
            }
            else {

                // If both values are same
                if(arr[left] == arr[right]) {

                    int k = right - left + 1;
                    count += k * (k - 1) / 2;

                    break;
                }

                // Count occurrences of left value
                int l = 1;
                while(left + l < right && arr[left] == arr[left + l]) {
                    l++;
                }

                // Count occurrences of right value
                int r = 1;
                while(right - r > left && arr[right] == arr[right - r]) {
                    r++;
                }

                count += l * r;

                left += l;
                right -= r;
            }
        }

        return count;
    }
}