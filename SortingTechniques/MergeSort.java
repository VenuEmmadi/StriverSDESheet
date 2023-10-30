public class Solution {
    public static int[] merge(int[] arr, int l, int m, int r){
        int i=l, j=m+1, k=0;
        int[] list = new int[r-l+1];
        while(i<=m && j<=r){
            if(arr[i]>arr[j]){
                list[k] = arr[j]; j++;
            }
            else{
                list[k] = arr[i]; i++;
            }
            k++;
        }
        while(i<=m){
            list[k] = arr[i]; i++; k++;
        }
        while(j<=r){
            list[k] = arr[j]; j++; k++;
        }
        for (int p = 0; p < list.length; p++) {
            arr[l + p] = list[p];
        }
        return arr;
    }

    public static void mergeSort(int[] arr, int l, int r){
        // Write your code here
        if(l>=r) return;
        int m = (l+r)/2;
        mergeSort(arr, l, m); mergeSort(arr, m+1, r);
        arr = merge(arr, l, m, r);

    }
}