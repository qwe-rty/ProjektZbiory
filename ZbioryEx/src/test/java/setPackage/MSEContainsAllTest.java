package setPackage;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import setpackage.MyExtendedSet;

@RunWith(Parameterized.class)
public class MSEContainsAllTest {
	
	//PARAMETRY
	Integer[] params;
	boolean expected;

	@Parameters
    public static Collection<Object[]> data() {
    	
    	return Arrays.asList(new Object[][]
    			{ 	{ new Integer[]{0,1,2,3}, false },
    				{ new Integer[]{}, true },
    				{ new Integer[]{0,6,3,4,8,9,1}, false },
    				{ new Integer[]{1,2,3}, true},
    				{ new Integer[]{2,4}, true}
    			} );
    }
    
    public MSEContainsAllTest(Integer[] params, boolean expected)
	{
		this.params = params;
		this.expected = expected;
	}
	
	@Test
	public void testContainsAll() {
		
		MyExtendedSet<Integer> obj = new MyExtendedSet<Integer>(1,2,3,4,5);
		List<Integer> paramsAsCol = Arrays.asList(params);
		
		assertEquals("Contains all from collection: ", expected, obj.containsAll(paramsAsCol));
		
	}

}
