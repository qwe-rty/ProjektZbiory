package setPackage;

import static org.junit.Assert.*;
import setpackage.MyExtendedSet;

import org.junit.Test;

public class MSECtrCpyTest {

	@Test
	public void test() {
		
		MyExtendedSet<Integer> cpyMe = new MyExtendedSet<Integer>(1,2,3,4,5);
		MyExtendedSet<Integer> obj = new MyExtendedSet<Integer>(cpyMe);
		
		assertArrayEquals("Extended cpy ctor:", obj.toArray(), cpyMe.toArray());
	}

}
