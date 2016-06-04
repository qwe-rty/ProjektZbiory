package setPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class MSTClear {

	@Test
	public void test() {
		
		MySet<Integer> obj = new MySet<Integer>(1,2,3,4,5);
		
		obj.clear();
		
		assertEquals("Clear: ", obj, new MySet<Integer>() );
	}

}
