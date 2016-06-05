package setPackage;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import setpackage.MySet;

@RunWith(Parameterized.class)
public class MSTEqualsTest {
	//PARAMETRY
		Integer[] a;
		Integer[] b;
		boolean expected;

		@Parameters
	    public static Collection<Object[]> data() {
	    	
	    	return Arrays.asList(new Object[][]
	    			{ 	{ new Integer[]{0,1,2,3}, new Integer[]{2,3,4}, false },
	    				{ new Integer[]{}, new Integer[]{}, true },
	    				{ new Integer[]{0,6,3,4,8,9,1}, new Integer[]{1,3,5,7}, false },
	    				{ new Integer[]{1,2,3}, new Integer[]{1,2,3}, true},
	    				{ new Integer[]{2,4}, new Integer[]{2,4}, true}
	    			} );
	    }
	    
	    public MSTEqualsTest(Integer[] a, Integer[] b, boolean expected)
		{
			this.a = a;
			this.b = b;
			this.expected = expected;
		}
		
		@Test
		public void test() {
			
			MySet<Integer> objA = new MySet<Integer>(a);
			MySet<Integer> objB = new MySet<Integer>(b);
			
			assertEquals("Is empty: ", expected, objA.equals(objB) );
		}

	}
