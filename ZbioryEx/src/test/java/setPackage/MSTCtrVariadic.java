package setPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class MSTCtrVariadic {

	@Test
	public void ctrTest1()
	{
		MySet<Integer> obj = new MySet<Integer>(1,2,3,4,5);
		
		assertEquals("Test konstruktora: variadic", 5, obj.size());
		
	}

}
