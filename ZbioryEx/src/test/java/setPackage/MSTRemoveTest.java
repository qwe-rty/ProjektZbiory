package setPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import setPackage.MySet;

public class MSTRemoveTest {

	@Test
	public void removeTest() {
		
		final int VAL = 2;
		
		MySet<Integer> obj = new MySet<Integer>();
		boolean[] expected = new boolean[]{false, true, false};
		boolean[] result = new boolean[3];
		
		result[0] = obj.contains(VAL);
		obj.add(VAL);
		result[1] = obj.contains(VAL);
		obj.remove(VAL);
		result[2] = obj.contains(VAL);
		
		
		assertArrayEquals("MSTRemove", expected, result);
	}

}
