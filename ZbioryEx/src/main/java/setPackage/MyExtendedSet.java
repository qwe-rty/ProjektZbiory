/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package setPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 *
 * @author Student
 */
public class MyExtendedSet<E> extends MySet<E> {
    
    
    public MyExtendedSet()
    {
        super();        
    }
    
    public MyExtendedSet(Collection<? extends E> c)
    {
        super(c);
    }
    
    public MyExtendedSet(E... elements)
    {
        super(elements);
    }   
    
    public boolean symetricDifference(Collection <? extends E> c)
    {        
        ArrayList<E> differenceBMinusA = new ArrayList(c);
        differenceBMinusA.removeAll(elements);
        boolean result = elements.removeAll(c);
        
        return elements.addAll(differenceBMinusA) || result;
    }
}
