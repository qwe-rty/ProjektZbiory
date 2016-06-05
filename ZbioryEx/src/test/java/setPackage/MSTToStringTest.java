package setPackage;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import setPackage.MySet;

@RunWith(Parameterized.class)
public class MSTToStringTest {
	
	//PARAMETRY
	MySet<Integer> tested = new MySet<Integer>(1,2,3,4,5,6,7,8,9,10);	
	Integer[] params;
	String expected;

	@Parameters
	public static Collection<Object[]> data() {
	    	
	  	return Arrays.asList(new Object[][]
	   			{ 	{ new Integer[]{0,1,2,3}, "[0, 1, 2, 3]" },
	   				{ new Integer[]{}, "[]" },
	   				{ new Integer[]{0,6,3,4,8,9,1}, "[0, 6, 3, 4, 8, 9, 1]" },
	   				{ new Integer[]{1,2,3,2,1}, "[1, 2, 3]" },
	   				{ new Integer[]{2,4,6,8,10,2}, "[2, 4, 6, 8, 10]" }
	   			} );
	}
	    
	public MSTToStringTest(Integer[] params, String expected)
	{
		this.params = params;
		this.expected = expected;
	}

	@Test
	public void test() {
		
		MySet<Integer> obj = new MySet<Integer>(Arrays.asList(params));
			
		assertTrue("ToString: ", expected.equals( obj.toString() )  );
	}

}
