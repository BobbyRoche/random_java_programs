import java.util.Comparator;
public class NumberLetterSorter implements Comparator<String> {

     
            public int compare(String first, String second)
   {
      String tempOne = first.substring(3,6);
      String tempTwo = second.substring(3,6);
         return tempOne.compareTo(tempTwo);
   }
}

