import java.util.*;
class Solution {
    public pair[] allPairs(int target, int arr1[], int arr2[]) {
        // code here
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<pair> list=new ArrayList<>();
        int i=0;
        int j=arr2.length-1;
        while(i<arr1.length && j>=0){
            int sum=arr1[i]+arr2[j];
            if(sum==target){
                int x=arr1[i];
                int y=arr2[j];
                int count1=0;
                while(i<arr1.length && arr1[i]==x){
                    count1++;
                    i++;
                }
                int count2=0;
                while(j>=0 && arr2[j]==y){
                    count2++;
                    j--;
                }
                for(int a=0;a<count1;a++){
                    for(int b=0;b<count2;b++){
                        list.add(new pair(x,y));
                    }
                }
            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }
        return list.toArray(new pair[0]);
    }
}