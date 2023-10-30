public class Solution {

    

    public static void quickSort(int[] arr,int low, int high) {

        /* Your class should be named Solution

         * Don't write main().

         * Don't read input, it is passed as function argument.

         * No need to print or return the output.

         * Taking input and printing output is handled automatically.

         */

         if(low<high){

            int index=partition(arr,low,high);

            quickSort(arr,low,index-1);

            quickSort(arr,index+1,high);

        }   

    }

    public static int partition(int[] arr,int low,int high){

        int pivot=arr[low];

        int i=low;

        int j=high;

        while(i<j){

            while (i<=high && arr[i]<=pivot){

                i++;

            }

            while(j>=low &&arr[j]>pivot){

                j--;

            }

            if(i<j){

                swap(arr,i,j);

            }

        }

        swap(arr,low,j);

        return j;

 

    }

    public static void swap(int[] arr,int i,int j){

        int temp=arr[i];

        arr[i]=arr[j];

        arr[j]=temp;

    }

    

}

