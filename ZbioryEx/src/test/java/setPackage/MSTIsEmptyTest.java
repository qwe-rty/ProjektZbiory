package setPackage;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import setPackage.MySet;

@RunWith(Parameterized.class)
public class MSTIsEmptyTest {
	//PARAMETRY
	Integer[] params;
	boolean expected;

	@Parameters
    public static Collection<Object[]> data() {
    	
    	return Arrays.asList(new Object[][]
    			{ 	{ new Integer[]{0,1,2,3}, false },
    				{ new Integer[]{}, true },
    				{ new Integer[]{0,6,3,4,8,9,1}, false },
    				{ new Integer[]{1,2,3}, false},
    				{ new Integer[]{2,4}, false}
    			} );
    }
    
    public MSTIsEmptyTest(Integer[] params, boolean expected)
	{
		this.params = params;
		this.expected = expected;
	}
	
	@Test
	public void test() {
		
		MySet<Integer> obj = new MySet<Integer>(params);
		
		assertEquals("Is empty: ", expected, obj.isEmpty() );
		
	}

}
