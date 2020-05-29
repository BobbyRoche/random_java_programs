import java.util.Comparator;
public class ReverseWordSorter implements Comparator<String>
{
 public int compare(String a, String b)
 {
 return -1 * (a.compareTo(b)) ;
 }
}