class Solution {
    public List<Integer> twoSum(int arr[], int target) {
        // code here
        List<Integer> res=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        int left=0;
        int right=n-1;
        while(left<right){
            int s=arr[left]+arr[right];
            if(s==target){
                res.add(arr[left]);
                res.add(arr[right]);
                return res;
            }
            else if(s<target){
                left++;
            }
            else{
                right--;
            }
        }
        return res;
    }
}