import java.util.Random;

public class QuickSorting

{

public static void main(String[] args)
{  
      for(int i = 0; i < 20; i++)
      {
    int max = 5000;
    
    ArrayayQuickSort array;

    Random rnd = new Random();

    array = new ArrayayQuickSort(max);

    ArrayayQuickSort.setCount2(0);

    ArrayayQuickSort.setCount1(0);

    for (int j = 0; j < max; j++)

    {

      int n = rnd.nextInt(5000);

      array.insert(n);

   }

    ArrayayQuickSort arraySorted;

    arraySorted = new ArrayayQuickSort(max);

    ArrayayQuickSort.setCount2(0);

    ArrayayQuickSort.setCount1(0);

    for (int j = 0; j < max; j++)
    {
      int x = j + 1;
      arraySorted.insert(x);
    }


    ArrayayQuickSort arrayReverseSorted;

    arrayReverseSorted = new ArrayayQuickSort(max);

    ArrayayQuickSort.setCount2(0);

    ArrayayQuickSort.setCount1(0);

    for (int j = 5000; j > 0; j--)
    {
      int n = j;
      arrayReverseSorted.insert(n);
    }

array.quickSort();

    System.out.println("Random-Order: " + ArrayayQuickSort.getCount2() + " Recursion Count :" + ArrayayQuickSort.getCount1() );

    arraySorted.quickSort();

    System.out.println("Sorted-Order: " + ArrayayQuickSort.getCount2() + " Recursion Count :" + ArrayayQuickSort.getCount1());

    arrayReverseSorted.quickSort();

    System.out.println("Reverse-Sorted: " + ArrayayQuickSort.getCount2() + " Recursion Count : " + ArrayayQuickSort.getCount1());

}

}

}