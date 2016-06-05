package setPackage;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import setPackage.MyExtendedSet;

@RunWith(Parameterized.class)
public class MESTSymetricDifferenceTest {
	// Parametry
	Integer[] a;
	Integer[] b;
	boolean expected;

	@Parameters
	public static Collection<Object[]> data() {

		return Arrays.asList(new Object[][] { { new Integer[] { 0, 1, 2, 3 }, new Integer[] { 0 } },
				{ new Integer[] { 0, 1, 2, 3 }, new Integer[] { 7, 5 } },

		});
	}

	public MESTSymetricDifferenceTest(Integer[] a, Integer[] b) {
		this.a = a;
		this.b = b;

	}

	@Test
	public void test() {
		MyExtendedSet<Integer> obj1 = new MyExtendedSet<Integer>(a);
		MyExtendedSet<Integer> obj2 = new MyExtendedSet<Integer>(b);
		assertTrue(obj1.symetricDifference(obj2));
	}
}
