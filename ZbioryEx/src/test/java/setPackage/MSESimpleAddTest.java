package setPackage;

import static org.junit.Assert.*;
import setpackage.MyExtendedSet;

import org.junit.Test;

public class MSESimpleAddTest {

	@Test
	public void test() {
		
		final int VAL = 3;
		
		MyExtendedSet<Integer> obj = new MyExtendedSet<Integer>();
		obj.add(VAL);
		
		assertTrue("Extended add:", obj.contains(VAL));
		
	}

}
