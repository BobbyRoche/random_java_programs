
import java.util.Scanner;

public class Module6_Roche_Assignment1

{

     public static void main(String args[])

     {

          Scanner in=new Scanner(System.in);

          String name[]={"Daniel", "George", "Adam", "Peter", "Michael", "Jones", "Tom", "Allison", "James","Brian"};

          BST tree=new BST();


          for(int i=0;i<name.length;i++)

          {

              tree.insert(name[i]);

          }


          System.out.println("\nThe tree in preorder is: ");

          tree.preorder();
        

          System.out.println("\nThe tree in inorder is: ");

          tree.inorder();        


          System.out.println("\nThe tree in postorder is: ");

          tree.postorder();



          tree.delete("Peter"); 
          
          System.out.println("\nContinuing to print in postorder after deleting Peter: ");

          tree.preorder();

          tree.delete("Brian");

        
          System.out.println("\nContinuing to print in post order after deleting Brian: ");

          tree.preorder();

     }

}