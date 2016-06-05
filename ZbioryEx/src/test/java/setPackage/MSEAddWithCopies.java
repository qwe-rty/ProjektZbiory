package setPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import setpackage.MyExtendedSet;

public class MSEAddWithCopies {

	@Test
	public void test() {
		
		final int[] VALS = new int[]{1,2,3,2,1};
		final int EXPECTED = 3;
		
		MyExtendedSet<Integer> obj = new MyExtendedSet<Integer>();
		
		for(int i = 0; i < VALS.length; ++i)
		{
			obj.add(VALS[i]);
		}
		
		
		assertEquals("Extended add with copies:", obj.size(), EXPECTED);
	}

}
