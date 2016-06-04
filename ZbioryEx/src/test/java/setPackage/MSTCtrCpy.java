package setPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class MSTCtrCpy {

	@Test
	public void cpyCtrTest()
	{
		final int FIRST = 1;
		final int SECOND = 2;
		final int THIRD = 3;
		
		MySet<Integer> cpyMe = new MySet<Integer>();
		cpyMe.add(FIRST);
		cpyMe.add(SECOND);
		cpyMe.add(THIRD);
		
		MySet<Integer> obj = new MySet<Integer>(cpyMe);
		
		assertEquals("Test konstruktora: kopiujący", true, obj.contains(SECOND));
	}
}
