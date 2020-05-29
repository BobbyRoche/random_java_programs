//Robert Roche
//Gerald Cohen Ph.D.
//Programming II (ProjectIII)
package librarycatalog;

public interface Catalogable extends Comparable {
    default String getID() { 
        return ""; 
    }
    default String getDescription() { 
        return ""; 
    }
    default String getSerialNumber() { 
        return ""; 
    }
    default String getLocation() { 
        return ""; 
    }
    
    default void isBorrowed(){}
}