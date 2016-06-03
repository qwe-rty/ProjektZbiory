package setPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class MySetTest {

	@Test
	public void test() {
		
		MySet<Integer> obj = new MySet();
		obj.add(5);
		
		assertEquals("Test pierwszy: dodawanie elementu", true, obj.contains(5));
	}

}
