package setPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import setPackage.MySet;

public class MSTSimpleAddTest {

	@Test
	public void test() {
		
		final int VAL = 3;
		
		MySet<Integer> obj = new MySet<Integer>();
		obj.add(VAL);
		
		assertTrue("Simple adding: ", obj.contains(VAL));
	}

}
