import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class AlphaFinder implements Comparator<String> {

   

   public static int finder(ArrayList<String> al){
      int value;
       value = Collections.binarySearch(al,"bbb   w");
      return value;
      
    }

    @Override
    public int compare(String o1, String o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 
}
