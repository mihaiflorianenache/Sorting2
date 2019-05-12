package org.fasttrackit;

public class SelectionSort {

    private void sort(int arr[])
    {
        int i,index,j,aux,otherIndex;
        for(i=0;i<arr.length;i++)
        {
            index=arr[i];
            otherIndex=i;
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[j]>index)//sortare descrescatoare
                {
                    index=arr[j];
                    otherIndex=j;
                }
            }

            aux=arr[i];
            arr[i]=arr[otherIndex];
            arr[otherIndex]=aux;
        }
    }

    private void printArray(int arr[])
    {
        int i;
        System.out.println("Sorted row is");
        for(i=0;i<arr.length;i++)
        {
            if(i!=arr.length-1) System.out.print(arr[i]+", ");
            else System.out.print(arr[i]);
        }
    }

    protected void callMethodsSelectionSort(int arr[])
    {
        sort(arr);
        printArray(arr);
    }
}

