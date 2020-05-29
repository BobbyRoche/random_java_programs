import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class sortRunner
{
 public static void main(String[] args) {
 ArrayList<String> al = new ArrayList<String>();
 al.add("aaa888q");
 al.add("aaa888q");
 al.add("aaa555q");
 al.add("aaa333q");
 al.add("aaa888p");
 al.add("aaa888a"); 
  al.add("bbb111z");
 al.add("bbb222w");
 al.add("ccc777a");
 al.add("eee888b");
 al.add("zzz000c");
 al.add("zzz666d");
 al.add("ppp333e");
 al.add("ppp111f");
 ReverseWordSorter rws = new ReverseWordSorter();
 Collections.sort(al,rws);
 System.out.println("ReverseWord order:");
 for(String s : al)
 System.out.println(s);
 LetterNumberSorter ls = new LetterNumberSorter();
 Collections.sort(al,ls);
 System.out.println("\nLetter-Number order:");
 for(String s : al)
 System.out.println(s);
 NumberLetterSorter nls = new NumberLetterSorter();
 Collections.sort(al,nls);
 System.out.println("\nNumber-Letter order:");
 for(String s : al)
 System.out.println(s);
  
int value;
Collections.sort(al);
value = AlphaFinder.finder(al); 
System.out.println(-value);


  
  }
}
 

