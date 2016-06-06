package setPackage;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import setpackage.MyExtendedSet;

public class MSEAddAllTest {

	@Test
	public void test() {
		
		final int[] VALS = new int[]{1,2,3,4,5};
		ArrayList<Integer> badValues = new ArrayList<Integer>();
		
		MyExtendedSet<Integer> a = new MyExtendedSet<Integer>(VALS[0], VALS[1], VALS[2]);
		MyExtendedSet<Integer> b = new MyExtendedSet<Integer>(VALS[3], VALS[4]);
		
		MyExtendedSet<Integer> obj = new MyExtendedSet<Integer>();
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
