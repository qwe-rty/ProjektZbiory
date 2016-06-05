/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package setpackage;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Student
 * @param <E>
 */
public class MyExtendedSet<E> extends MySet<E> {
	/**
	 *  
	 */
	public MyExtendedSet() {
		super();
	}

	/**
	 * @param c
	 */
	public MyExtendedSet(Collection<? extends E> c) {
		super(c);
	}

	/**
	 * @param elements
	 */
	public MyExtendedSet(E... elements) {
		super(elements);
	}

	/**
	 * @param c
	 * @return boolean
	 */
	public boolean symetricDifference(Collection<? extends E> c) {
		ArrayList<E> differenceBMinusA = new ArrayList(c);
		differenceBMinusA.removeAll(elements);
		boolean result = elements.removeAll(c);
		return elements.addAll(differenceBMinusA) || result;
	}
}
