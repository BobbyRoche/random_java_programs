
public class BSTnodes

{

     BSTnodes left, right;

     String name;

     /* Constructor */

     public BSTnodes()

     {

          left = null;

          right = null;

          name = null;

     }

     /* Constructor */

     public BSTnodes(String word)

     {

          left = null;

          right = null;

          name = word;

     }

     /* Function to set left node */

     public void setLeft(BSTnodes n)

     {

          left = n;

     }

     /* Function to set right node */

     public void setRight(BSTnodes n)

     {

          right = n;

     }

     /* Function to get left node */

     public BSTnodes getLeft()

     {

          return left;

     }

     /* Function to get right node */

     public BSTnodes getRight()

     {

          return right;

     }

     /* Function to set data to node */

     public void setData(String d)

     {

          name = d;

     }

     /* Function to get data from node */

     public String getData()

     {

          return name;

     }   

}




