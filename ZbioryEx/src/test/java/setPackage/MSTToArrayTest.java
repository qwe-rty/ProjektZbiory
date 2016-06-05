package setPackage;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import setPackage.MySet;

@RunWith(Parameterized.class)
public class MSTToArrayTest {
	
	//PARAMETRY
	Integer[] params;
	
	@Parameters
    public static Collection<Object[]> data() {
    	
    	return Arrays.asList(new Object[][]
    			{ 	{ new Integer[]{0,1,2,3} },
    				{ new Integer[]{} },
    				{ new Integer[]{0,6,3,4,8,9,1} }
    			} );
    }
	
	public MSTToArrayTest(Integer[] params)
	{
		this.params = params;
	}
	

	@Test
	public void parTest1() {
		
		MySet<Integer> obj = new MySet<Integer>(Arrays.asList(params));
		
		assertArrayEquals("Test pierwszy: rozmiar ", params, obj.toArray());
	}
}