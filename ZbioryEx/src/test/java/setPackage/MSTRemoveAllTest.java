package setPackage;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import setpackage.MySet;

@RunWith(Parameterized.class)
public class MSTRemoveAllTest {

	//PARAMETRY
	MySet<Integer> tested = new MySet<Integer>(1,2,3,4,5,6,7,8,9,10);	
	Integer[] params;
	Integer[] expected;

	@Parameters
	public static Collection<Object[]> data() {
	    	
	  	return Arrays.asList(new Object[][]
	   			{ 	{ new Integer[]{0,1,2,3}, new Integer[]{4,5,6,7,8,9,10} },
	   				{ new Integer[]{}, new Integer[]{1,2,3,4,5,6,7,8,9,10} },
	   				{ new Integer[]{0,6,3,4,8,9,1}, new Integer[]{2,5,7,10} },
	   				{ new Integer[]{1,2,3,2,1}, new Integer[]{4,5,6,7,8,9,10} },
	   				{ new Integer[]{2,4,6,8,10,2}, new Integer[]{1,3,5,7,9} }
	   			} );
	}
	    
	public MSTRemoveAllTest(Integer[] params, Integer[] expected)
	{
		this.params = params;
		this.expected = expected;
	}

	@Test
	public void test() {
			
		//No obj
		List<Integer> paramsList = Arrays.asList(params);   	
	  	tested.removeAll(paramsList);
			
		assertArrayEquals("Retain: ", expected, tested.toArray() );
			
	}

}