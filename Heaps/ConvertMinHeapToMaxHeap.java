import java.util.*;
import java.io.*;
public class Solution {
    public static void heapify(int arr[],int i){
        int index =i;
        int largest = index;
        int left = index*2+1;
        int right = index*2+2;
        if(left<arr.length && arr[left]>arr[largest]){
            largest = left;
        }
        if(right<arr.length && arr[right]>arr[largest]){
            largest = right;
        }
        if(largest!=index){
            int temp = arr[largest];
            arr[largest] = arr[index];
            arr[index] = temp;
            heapify(arr, largest);
        }
    }
    public static int[] MinToMaxHeap(int n, int[] arr){
        int parent = (n/2)-1;
        for(int i=parent;i>=0;i--){
            heapify(arr,i);
        }
        int ans[] = new int[n];
         for (int i = 0; i < n; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }
}