
package setPackage;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import setPackage.MySet;

public class MSTAddAllTest {

	@Test
	public void testAddAll() {
		
		final int ONE = 1;
		final int TWO = 2;
		final int THREE = 3;
		final int FOUR = 4;
		final int FIVE = 5;
		
		final int[] VALS = new int[]{ONE, TWO, THREE, FOUR, FIVE};
		ArrayList<Integer> badValues = new ArrayList<Integer>();
		
		//przygotuj sety częściowe
		MySet<Integer> a = new MySet<Integer>(VALS[0], VALS[1], VALS[2]);
		MySet<Integer> b = new MySet<Integer>(VALS[3], VALS[4]);
		
		//Przygotuj obj
		MySet<Integer> obj = new MySet<Integer>();
		obj.addAll(a);
		obj.addAll(b);
		
		for(int i = 0; i < VALS.length; ++i)
		{
			if(!obj.contains(VALS[i]) )
			{
				badValues.add(VALS[i]);
			}
				
		}
			
		assertArrayEquals("Test add all: problem with " + badValues.toString(), new ArrayList<Integer>().toArray(), badValues.toArray() );
	}

}