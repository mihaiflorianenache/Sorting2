package org.fasttrackit;

public class InsertionSort {

    private void sort(int arr[]) {
        int i,j,key;
        for(i=1;i<arr.length;i++)
        {
            key=arr[i];
            j=i-1;
            while(j>=0){
                if(arr[j]>key)
                    arr[j+1]=arr[j];
                else
                    break;
                j--;
            }
            arr[0]=key;
        }
    }

    private void printArray(int arr[]) {
        System.out.print("Sorted row is: ");
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(i!=arr.length-1) System.out.print(arr[i]+", ");
            else System.out.print(arr[i]);
        }
    }

    protected void callMethodsInsertSort(int arr[]) {
        sort(arr);
        printArray(arr);
    }
}

