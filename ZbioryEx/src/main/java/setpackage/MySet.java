/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package setpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Student
 * 
 * @param <E>
 */
public class MySet<E> implements Set<E> {

	protected ArrayList<E> elements;

	/**
	 * 
	 */
	public MySet() {
		this.elements = new ArrayList();
	}

	/**
	 * @param c
	 */
	public MySet(Collection<? extends E> c) {
		this.elements = new ArrayList();
		for (E elem : c) {
			this.add(elem);
		}
	}

	/**
	 * @param elements
	 */
	public MySet(E... elements) {
		this.elements = new ArrayList();
		for (E elem : elements) {
			this.add(elem);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object other) {

		MySet<Integer> otherAsSet;
		try {
			otherAsSet = (MySet<Integer>) other;
			return this.containsAll(otherAsSet) && otherAsSet.containsAll(this);
		} catch (ClassCastException ex) {
			return false;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Set#size()
	 */
	public int size() {
		return elements.size();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Set#isEmpty()
	 */
	public boolean isEmpty() {
		return elements.isEmpty();
	}

	// @Override
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Set#contains(java.lang.Object)
	 */
	public boolean contains(Object o) {
		return elements.contains(o);
	}

	// @Override
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Set#iterator()
	 */
	public Iterator<E> iterator() {
		return elements.iterator();
	}

	// @Override
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Set#toArray()
	 */
	public Object[] toArray() {
		return elements.toArray();
	}

	// @Override
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Set#toArray(java.lang.Object[])
	 */
	public <T> T[] toArray(T[] a) {
		return elements.toArray(a);
	}

	// @Override
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Set#add(java.lang.Object)
	 */
	public boolean add(E e) {
		return !elements.contains(e) ? elements.add(e) : false;
	}

	// @Override
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Set#remove(java.lang.Object)
	 */
	public boolean remove(Object o) {
		return elements.remove(o);
	}

	// @Override
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Set#containsAll(java.util.Collection)
	 */
	public boolean containsAll(Collection<?> c) {
		return elements.containsAll(c);
	}

	// @Override
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Set#addAll(java.util.Collection)
	 */
	public boolean addAll(Collection<? extends E> c) {
		boolean changed = false;

		for (E e : c) {
			if (this.add(e)) { // tutaj zachodzi efekt uboczny
				changed = true;
			}
		}

		return changed;
	}

	// @Override
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Set#retainAll(java.util.Collection)
	 */
	public boolean retainAll(Collection<?> c) {
		ArrayList<E> elementsToRemove = new ArrayList();

		for (E e : elements) {
			if (!c.contains(e)) {
				elementsToRemove.add(e);
			}
		}

		return elements.removeAll(elementsToRemove);
	}

	// @Override
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Set#removeAll(java.util.Collection)
	 */
	public boolean removeAll(Collection<?> c) {
		return elements.removeAll(c);
	}

	// @Override
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Set#clear()
	 */
	public void clear() {
		elements.clear();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return elements.toString();
	}

}
