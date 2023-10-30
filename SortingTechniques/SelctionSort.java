public class Solution {
    public static void selectionSort(int[] arr) {
        //Your code goes here
        for(int i=0;i<arr.length;i++){
            int index = smallerIndex(i,arr);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
    public static int smallerIndex(int i,int[] arr){
        int smallerNum = arr[i];
        int smallerIndex = i;
        int n = i;
        for(n=n+1;n<arr.length;n++){
            if(arr[n]<smallerNum){
                smallerNum = arr[n];
                smallerIndex = n;
            }
        }
        return smallerIndex;
    }
}