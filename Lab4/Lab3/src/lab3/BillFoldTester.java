//Robert Roche (Partner Christopher Patrick)
//lab3
package lab3;


public class BillFoldTester {
 public static void main(String[] args)
 {
 DriversLicense d = new DriversLicense("John Doe", 2003);
 CallingCard c = new CallingCard("Omega Card", "301233985945", 1030);

 BillFold b = new BillFold(d,c);

 b.addCard(d);
 b.addCard(c);

 System.out.println(b.formatCards());
 System.out.println("Number of expired cards: " + b.getExpiredCardCount());
 System.out.println("Expected: 1");
 }
}