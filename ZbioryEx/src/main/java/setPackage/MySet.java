/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package setPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Student
 */
public class MySet<E> implements Set<E> {

    protected ArrayList<E> elements;
    
    public MySet()
    {
        this.elements = new ArrayList();
    }
    
    public MySet(Collection<? extends E> c)
    {
        this.elements = new ArrayList();
        this.elements.addAll(c);
    }
    
    public MySet(E... elements)
    {
        this.elements = new ArrayList();        
        this.elements.addAll(Arrays.asList(elements));
    }   
    
    //@Override
    public int size() {
        return elements.size();
    }

    //@Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    //@Override
    public boolean contains(Object o) {
        return elements.contains(o);
    }

    //@Override
    public Iterator<E> iterator() {
        return elements.iterator();
    }

    //@Override
    public Object[] toArray() {
        return elements.toArray();
    }

    //@Override
    public <T> T[] toArray(T[] a) {
        return elements.toArray(a);
    }

    //@Override
    public boolean add(E e) {
        return !elements.contains(e) ? elements.add(e) : false;            
    }

    //@Override
    public boolean remove(Object o) {
        return elements.remove(o);
    }

    //@Override
    public boolean containsAll(Collection<?> c) {
        return elements.containsAll(c);
    }

    //@Override
    public boolean addAll(Collection<? extends E> c) {
        boolean changed = false;
        
        for(E e : c)
        {
            if(!elements.contains(e))
            {
                elements.add(e);
                changed = true;
            }
        }
        
        return changed;
    }

    //@Override
    public boolean retainAll(Collection<?> c) {        
        ArrayList<E> elementsToRemove = new ArrayList();
        
        for(E e : elements)
        {
            if(!c.contains(e))
            {
                elementsToRemove.add(e);
            }
        } 
        
        return elements.removeAll(elementsToRemove);
    }

    //@Override
    public boolean removeAll(Collection<?> c) {
        return elements.removeAll(c);
    }

    //@Override
    public void clear() {
        elements.clear();
    }
    
    @Override
    public String toString()
    {
        return elements.toString();
    }
    
}