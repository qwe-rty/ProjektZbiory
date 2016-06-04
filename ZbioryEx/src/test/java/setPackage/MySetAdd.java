package setPackage;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MySetAdd {
	
	//PARAMETRY
	int param;
	boolean expected;
	
	@Parameters
    public static Collection<Object[]> data() {
    	
    	return Arrays.asList(new Object[][]
    			{ { 1, true}, {2, true} } );
    }
	
	public MySetAdd(int param, boolean expected)
	{
		this.param = param;
		this.expected = expected;
	}
	

	@Test
	public void addTest()
	{
		MySet<Integer> obj = new MySet<Integer>();
		obj.add(param);
		
		assertEquals("Test pierwszy: dodawanie elementu", expected, obj.contains(param));
	}
}
