/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module4_roche_assignment;

/**
 *
 * @author Bobby
 */
public class Module4_Roche_Assignment {

    /**
     * @param args the command line arguments
     */        public static void main(String[] args)
	 {
	 Queue A = new Queue();
	 int n = 1;
	 int arrival = (int) (Math.random() * 5 + 1);
	 for(int i = 1; i <= 720; i++){
		 if( i % arrival == 0){
			 A.insert(n, (int) (Math.random() * 5 + 1));
			 arrival = (int) (Math.random() * 5 + 1);
			 n++;
		 }
		 if( A.empty() == false && i % A.departure() == 0){
			 A.remove();
		 }
	 }
	 
	 System.out.println("Total Amount of Customers: " + (n - 1));
	 System.out.println("Customers Remaining in Queue: " + A.QueueSize());
	 }

}

