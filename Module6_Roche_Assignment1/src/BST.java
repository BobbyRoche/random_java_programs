public class BST

{

     private BSTnodes node;


     public BST()

     {

          node = null;

     }
     
     public boolean isEmpty()

     {

          return node == null;

     }

     public void insert(String data)

     {

          node = insert(node, data);

     }

     private BSTnodes insert(BSTnodes node, String name)

     {

          if (node == null)
              node = new BSTnodes(name);

          else

          {

              if (name.compareTo(node.getData())>0)
                   node.left = insert(node.left, name);

              else
                   node.right = insert(node.right, name);

          }

          return node;

     }

     public void delete(String word)

     {

          if (isEmpty())

              System.out.println("Tree Empty");

          else if (search(word) == false)

              System.out.println(word + " does not exist.");

          else

          {

              node = delete(node, word);

              System.out.println(word+ " deleted");

          }

     }

     private BSTnodes delete(BSTnodes node, String k)

     {

          BSTnodes node1, node2, pnode;

          if (node.getData().equalsIgnoreCase( k))

          {

              BSTnodes left, right;

              left = node.getLeft();

              right = node.getRight();

              if (left == null && right == null)

                   return null;

              else if (left == null)

              {

                   node1 = right;

                   return node1;

              }

              else if (right == null)

              {

                   node1 = left;

                   return node1;

              }

              else

              {

                   node2 = right;

                   node1 = right;

                   while (node1.getLeft() != null)

                        node1 = node1.getLeft();

                   node1.setLeft(left);

                   return node2;

              }

          }

          if (k.compareTo( node.getData())>0)

          {

              pnode = delete(node.getLeft(), k);

              node.setLeft(pnode);

          }

          else

          {

              pnode= delete(node.getRight(), k);

              node.setRight(pnode);           

          }

          return node;

     }

     //countNodes function to count the nodes

     public int countNodes()

     {

          return countNodes(node);

     }

     //countNodes function by passing the root

     private int countNodes(BSTnodes r)

     {

          if (r == null)

              return 0;

          else

          {

              int count = 1;

              count += countNodes(r.getLeft());

              count+= countNodes(r.getRight());

              return count;

          }

     }

     // search function

     public boolean search(String val)

     {

          return search(node, val);

     }

     // search function to search for an element recursively

     private boolean search(BSTnodes r, String word)

     {

          boolean found = false;

          while ((r != null) && !found)

          {

              String rval = r.getData();

              if (word.compareTo(rval)>0)

                   r = r.getLeft();

              else if (word.compareTo(rval)<0)

                   r = r.getRight();

              else

              {

                   found = true;

                   break;

              }

              found = search(r, word);

          }

          return found;

     }

     //inorder traversal function

     public void inorder()

     {

          inorder(node);

     }

     //inorder traversal function recursively

     private void inorder(BSTnodes r)

     {

          if (r != null)

          {

              inorder(r.getLeft());

              System.out.print(r.getData() +" \t");

              inorder(r.getRight());

          }

     }


     public void preorder()

     {

          preorder(node);

     }


     private void preorder(BSTnodes r)

     {

          if (r != null)

          {

              System.out.print(r.getData() +" \t");

              preorder(r.getLeft());           

              preorder(r.getRight());

          }

     }

     //preorder traversal function

     public void postorder()

     {

          postorder(node);

     }

     //postorder traversal function recursively

     private void postorder(BSTnodes r)

     {

          if (r != null)

          {

              postorder(r.getLeft());           

              postorder(r.getRight());

              System.out.print(r.getData() +" \t");

          }

     }   

}
