//Robert Roche
//Data Structures
//M2 Assignment
package module2_lastname_assignment1;
import java.util.*;


public class Module2_Roche_Assignment1 {

    
    public static void main(String[] args) {
    int matrix[][] = {{ 1, 2, 3, 4},
                 { 5, 6, 7, 8},
                 { 9, 10, 11, 12},
                 {  13, 14, 15, 16}};
   
   printMatrix(matrix);
   System.out.println();
   
   getTotalSum(matrix);
   System.out.println();
   
   rowSums(matrix);
   System.out.println();
   
   colSums(matrix);
   System.out.println();
    
   
   diagonalSums(matrix);  
}
    
 public static void printMatrix(int matrix[][]){
     System.out.print("Matrix: ");
for(int i = 0; i<matrix.length;i++)
{System.out.println();
 for(int j = 0; j<matrix.length;j++)
System.out.print(matrix[i][j] +" ");
}
}
 
 public static void getTotalSum(int matrix[][]){
     int sum = 0;
     for(int i = 0; i<matrix.length;i++)
 for(int j = 0; j<matrix.length;j++){
sum+=matrix[i][j];
 }
System.out.print("\nTotal sum of elements: " + sum);
}
 
 public static void rowSums(int matrix[][]){
     int row1=0,row2=0,row3=0,row4=0;
     for(int i = 0; i<4; i++)
    row1+=matrix[0][i];
for(int i = 0; i<4; i++)
    row2+=matrix[1][i];
for(int i = 0; i<4; i++)
    row3+=matrix[2][i];
for(int i = 0; i<4; i++)
    row4+=matrix[3][i];
System.out.println("Sum Row 1: " + row1);
System.out.println("Sum Row 2: " + row2);
System.out.println("Sum Row 3: " + row3);
System.out.println("Sum Row 4: " + row4);
 }

 public static void colSums(int matrix[][]){
     int col1=0,col2=0,col3=0,col4=0;
     for(int i = 0; i<4; i++)
    col1+=matrix[i][0];
for(int i = 0; i<4; i++)
    col2+=matrix[i][1];
for(int i = 0; i<4; i++)
    col3+=matrix[i][2];
for(int i = 0; i<4; i++)
    col4+=matrix[i][3];
System.out.println("Sum Column 1: " + col1);
System.out.println("Sum Column 2: " + col2);
System.out.println("Sum Column 3: " + col3);
System.out.println("Sum Column 4: " + col4);
     
 }
 public static void diagonalSums(int matrix[][]){
     int diagonal1=0,diagonal2=0;
     for(int i = 0; i<matrix.length;i++)
 for(int j = 0; j<matrix.length;j++){
if(i == j)
   diagonal1+=matrix[i][j];
 }
for(int i = 0; i <matrix.length;i++)
    diagonal2 = diagonal2+matrix[3-i][i];
        
System.out.println("Sum Diagonal 1: " + diagonal1);
System.out.println("Sum Diagonal 2: " + diagonal2);
 }
    
    
    
    
    
    
    
    
    
}
