package setPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import setpackage.MyExtendedSet;

public class MSEClearTest {

	@Test
	public void test() {
		
		MyExtendedSet<Integer> obj = new MyExtendedSet<Integer>(1,2,3,4,5);
		
		obj.clear();
		
		assertEquals("Clear: ", obj, new MyExtendedSet<Integer>() );
	}

}
