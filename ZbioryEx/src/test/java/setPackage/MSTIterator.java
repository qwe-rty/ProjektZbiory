package setPackage;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MSTIterator {

	Integer[] params;
	int val;
	boolean expected;

	@Parameters
    public static Collection<Object[]> data() {
    	
    	return Arrays.asList(new Object[][]
    			{ 	{ new Integer[]{0,1,2,3}, 2, true },
    				{ new Integer[]{}, 5, false },
    				{ new Integer[]{0,6,3,4,8,9,1}, 6, true },
    				{ new Integer[]{1,2,3}, 4, false },
    				{ new Integer[]{2,4}, 2, true }
    			} );
    }
    
    public MSTIterator(Integer[] params, int val, boolean expected)
	{
		this.params = params;
		this.val = val;
		this.expected = expected;
	}
	
	@Test
	public void test() {
		
		boolean flag = false;
		
		MySet<Integer> obj = new MySet<Integer>(Arrays.asList(params));
		
		for(Integer elem : obj)
			if(elem.equals(val))
				flag = true;
	
		assertEquals("Iterator: ", expected, flag);
		
	}
}
