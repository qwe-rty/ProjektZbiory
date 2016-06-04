package setPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class MSTSimpleAdd {

	@Test
	public void test() {
		
		final int VAL = 3;
		
		MySet<Integer> obj = new MySet<Integer>();
		obj.add(VAL);
		
		assertTrue("Simple adding: ", obj.contains(VAL));
	}

}
