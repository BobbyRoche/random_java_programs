
import java.util.Comparator;


public class LetterNumberSorter implements Comparator<String> {
     public int compare(String first, String second)
   {
      String tempOne = first.substring(0,3) + first.charAt(6);
      String tempTwo = second.substring(0,3) + second.charAt(6);
         return tempOne.compareTo(tempTwo);
   }
}
