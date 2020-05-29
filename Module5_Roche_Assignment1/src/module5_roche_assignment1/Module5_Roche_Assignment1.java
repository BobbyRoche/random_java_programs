
package module5_roche_assignment1;

import java.util.Scanner;



/**
 *
 * @author Bobby
 */
public class Module5_Roche_Assignment1 extends MyLinkedList{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyLinkedList list = new MyLinkedList() ;
        String ans;
        int index = 0;
        boolean check = false;
        do{
            System.out.println("Please enter a name: (type 'stop' to stop inserting) ");
            ans = input.nextLine();
            if(!ans.equals("stop"))
            {
            check = list.checkName(ans);
            if(check == true)
            list.insert(ans);
            else
              System.out.println("This name already exists in the list.");
            }
            
        }while(!ans.equals("stop"));
        
        
        System.out.println();
        list.showAll();
        
       
               

        
    }

    
}
