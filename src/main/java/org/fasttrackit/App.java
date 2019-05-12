package org.fasttrackit;

public class App
{
    public static void main( String[] args )
    {
        int arr[] = {64, 34,35,40,20,19,18,21,22, 25, 12, 11, 90};

        /*SelectionSort selectSort = new SelectionSort();
         selectSort.callMethodsSelectionSort(arr);*/

        /*InsertionSort insertSort=new InsertionSort();
        insertSort.callMethodsInsertSort(arr);*/

        BubbleSort bubbleSort=new BubbleSort();
        bubbleSort.callMethodsBubbleSort(arr);

    }
}