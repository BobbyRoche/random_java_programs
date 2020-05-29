public class ArrayayQuickSort {

private int[] nArray;

    private int elements;

    private static int sCount=0;

    private static int mCount = 0;

public ArrayayQuickSort(int max) {

        nArray = new int[max];

        elements = 0;

    }

public void insert(int value) {

        nArray[elements] = value;

        elements++;

    }

public void show(){

        System.out.print("Array = ");

        for (int i = 0; i < elements; i++)

        {

            System.out.print(nArray[i] + " ");

            if(i%25==0)

                System.out.println();

        }

        System.out.println();

    }

private void swap(int dx, int dy) {

        int temp = nArray[dx];

        nArray[dx] = nArray[dy];

        nArray [dy] = temp;

        sCount++; // I am counting here to see how many times numbers are swapped.

    }

private int median(int left, int right)

    {

        int center =(left+right)/2;

if(nArray[left] > nArray [center])

            swap(left, center);

        if(nArray[left] > nArray[right])

            swap(left, right);

        if(nArray[center] > nArray[right])

            swap(center, right);

swap(center, right);

        mCount++;   // I am counting here to see how many times the pivot is changed

        return nArray[right];

}

public void quickSort()

    {

        rQuickSort(0, elements -1);

    }

private void rQuickSort(int left, int right)

    {

        int size = right-left+1;

        if(size < 5)

            insertionSort(left, right);

        else

        {

            int median = median(left, right);

            int part = partitionIt(left, right, median);

            rQuickSort(left, part-1);

            rQuickSort(part+1, right);

}

    }

private int partitionIt(int left, int right, int pivot) {

        int leftPtr = left - 1;

        int rightPtr = right;

while (true) {

            while (nArray[++leftPtr] < pivot)

            ;

            while (nArray[--rightPtr] > pivot)

            ;

            if(leftPtr >= rightPtr)

                break;

            else

                swap(leftPtr, rightPtr);

        }

        swap(leftPtr, right);

        return leftPtr;

    }

private void insertionSort(int left, int right) {

        int in, out;

for (out = left + 1; out <= right; out++) {

            int temp = nArray[out];

            in = out;

            while (in > left && nArray[in - 1] >= temp) {

                nArray[in] = nArray[in - 1];

                in--;

            }

            nArray[in] = temp;

        }

    }

public static int getCount1()

  {   //* get Median Count //*
    return mCount;

}

public static void setCount1(int mCount)

{

    ArrayayQuickSort.mCount = mCount; //* set Median Count //*

}

public static int getCount2()

{

    return sCount; //* get swap Count //*

}

public static void setCount2(int sCount)

{

    ArrayayQuickSort.sCount = sCount; //* set swap Count //*

}

}