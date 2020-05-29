//Robert Roche
//Lab 2
package arraylistrunner;

import java.util.ArrayList;
public class ArrayListRunner {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names);
        System.out.println();
        String first, last;
        //adds elements to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Connie");
        names.add("David");
        names.add("Edward");
        names.add("Fran");
        names.add("Gomez");
        names.add("Harry");
        //Part(a)
        System.out.println(names);
        
        System.out.println();
        //Part(b)
        first = names.get(0);
        last = names.get(names.size()-1);
        System.out.println("The first name is: " + first + "\nThe last name is: " + last);
        
        System.out.println();
        //Part(c)
        System.out.println("The arraylist has " + (names.size()-1) + " elements.");

        System.out.println();
        //Part(d)
        System.out.println("The last name in the list is " + names.get(names.size()-1));
        
        System.out.println();
        //Part(e)
         names.set(0, "Alice B. Toklas");
        System.out.println(names);
        
        System.out.println();
        //Part(f)
        ArrayList<String> david = new ArrayList<String>();
        david.add("David");
        names.addAll(david);
        System.out.println(names);
        
        System.out.println();
        //Part(g)
        for(String name: names)
        {
            System.out.println(name);
        }
        
        System.out.println();
        //Part(h)
        ArrayList<String>names2 = new ArrayList <String>(names);
        System.out.println(names2);
        
        System.out.println();
        //Part(i)
        names.remove(0);
        System.out.println(names + " " + names2);
        
        

    }
    
}
