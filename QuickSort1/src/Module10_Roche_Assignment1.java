
import java.util.Random;

public class Module10_Roche_Assignment1 {
public static int compare = 0;

public static void main(String[] args) {
    int arraySize = 5000;
    
    int[] array = createArray(arraySize);

    System.out.println("Begin: ");
    long start = System.currentTimeMillis();
    quickSort(array,0,arraySize-1);
    System.out.println( "End: " + (System.currentTimeMillis() - start)+ " milliseconds");
    System.out.println("There were " + compare + " comparisons.");
}

public static int[] createArray(int arraySize) {
    int[] anArray = new int[arraySize];
    Random random = new Random();

    for(int i=0; i < anArray.length; i++ ) {
        anArray[i] = random.nextInt();
    }
    return anArray;
}


public static void quickSort( int array[], int place, int pivot) {

    if( place < pivot ) 
    {
        int q = part(array, place, pivot);
        quickSort(array, place, q-1);
        quickSort(array, q+1, pivot);
    }

}

public static int part(int array[], int place, int pivot ) {
    int x = array[pivot];
    int i = place - 1;

    for(int j = place; j < (pivot-1); j++ ) {
        compare++;
        if(array[j] <= x) {
             i = i + 1;
             int temp = array[i];
             array[i] = array[j];
             array[j] = temp;
        }
    }
    int temp = array[i+1];
    array[i+1] = array[pivot];
    array[pivot] = temp;
        return i+1;
    }

}
