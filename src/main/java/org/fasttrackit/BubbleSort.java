package org.fasttrackit;

public class BubbleSort
{
    void sort(int arr[])
    {
        int n=arr.length;
        int i,j,aux;
        for(i=0;i<arr.length-1;i++){
            for(j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    aux=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=aux;
                }
            }
        }
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public void callMethodsBubbleSort(int arr[]){
        sort(arr);
        printArray(arr);
    }
}

