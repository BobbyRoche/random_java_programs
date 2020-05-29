
package module5_roche_assignment1;

import java.util.LinkedList;


public class MyLinkedList{
    private Node h;
    private int size;
    public MyLinkedList(){
        h = new Node();
        h.l = null;
        h.next = null;
        size = 0;
    }
    public boolean insert(String newListing){
        Node n = new Node();
        if(n == null)
            return false;
        else{
            n.next = h.next;
            h.next = n;
            n.l = newListing;
            size++;
            return true;
        }
    }
public void delete(){
        h = h.next;
        size--;
    }
public void insertEnd(String newListing){
     Node n = new Node();
     Node a = new Node();
     
     n = h;

     while(n.next!=null){
         n=n.next;
     }
     a.l = newListing;
     n.next = a;
     size++;
  
 }
 public void deleteEnd(){
     Node n = new Node();
     
     n = h;

     while(n.next.next!=null){
         n=n.next;
     }
     n.next=null;
     size--;
     
 }
 public void insertMiddle(int index, String newListing){
     int i = 0;
     Node a = new Node();
     Node temp = new Node();
     a.l = newListing;
     Node n = h;
     while( i < index){
         n = n.next;
         i++;
     }
     temp = n.next;
     a.l = newListing;
     n = a;
     n.next = temp;    
 }
 public boolean deleteMiddle(String target){
     Node q = h;
     Node p = h.next;
     while(p!=null && !(p.l.compareTo(target)==0)){
         q = p;
         p = p.next;
     }
     if(p!=null){
         q.next = p.next;
         return true;
     }
     else
         return false;
 }
 
 public int getSize(){
     return size;
 }
    public String fetch(String target){
        Node p = h.next;
        while(p!=null && !(p.l.compareTo(target)==0)){
            p = p.next;
        }
        if(p!= null)
            return p.l;
        
        else
            return null;
    }
   
    public boolean checkName(String name){
     Node n = new Node();
     String check;
    
     n = h;

     while(n!=null){
         check = checkHelper(n);
         if(check == null ? name == null : check.equals(name))
             return false;
          else
            n=n.next;
     }
     return true;
        
    }
    String checkHelper(Node n){
        String check;
        check = n.l;
        return check;
        
    }
  
    public void showAll(){
        Node p = h.next;
        while(p!=null){
            System.out.println(p.l.toString());
            p=p.next;
        }
    }
 
    public class Node{
        private String l;
        private Node next;
        public Node(){
            
        }
    }
    
    
}
