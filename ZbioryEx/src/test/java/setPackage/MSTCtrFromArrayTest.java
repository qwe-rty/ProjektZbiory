package setPackage;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import setpackage.MySet;

@RunWith(Parameterized.class)
public class MSTCtrFromArrayTest {
	
	//PARAMETRY
	Integer[] params;
	int expected;
	
	@Parameters
    public static Collection<Object[]> data() {
    	
    	return Arrays.asList(new Object[][]
    			{ 	{ new Integer[]{0,1,2,3}, 4 },
    				{ new Integer[]{}, 0 },
    				{ new Integer[]{0,6,3,4,8,9,1}, 7 }
    			} );
    }
	
	public MSTCtrFromArrayTest(Integer[] params, int expected)
	{
		this.params = params;
		this.expected = expected;
	}
	

	@Test
	public void parTest1() {
		
		MySet<Integer> obj = new MySet<Integer>(Arrays.asList(params));
		
		assertEquals("Test pierwszy: rozmiar ", expected, obj.size());
	}
}