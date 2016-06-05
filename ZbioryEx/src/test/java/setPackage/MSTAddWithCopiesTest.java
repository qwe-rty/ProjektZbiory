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
public class MSTAddWithCopiesTest {
	
	//PARAMETRY
	Integer[] params;
	int expected;

	@Parameters
    public static Collection<Object[]> data() {
    	
    	return Arrays.asList(new Object[][]
    			{ 	{ new Integer[]{0,1,2,3}, 4 },
    				{ new Integer[]{}, 0 },
    				{ new Integer[]{0,6,3,4,8,9,1}, 7 },
    				{ new Integer[]{1,2,3, 2, 1}, 3},
    				{ new Integer[]{2,4, 6, 8, 10, 2}, 5}
    			} );
    }
    
    public MSTAddWithCopiesTest(Integer[] params, int expected)
	{
		this.params = params;
		this.expected = expected;
	}

    @Test
	public void test() {
		
		MySet<Integer> obj = new MySet<Integer>();
		for(int i = 0; i < params.length; ++i)
			obj.add(params[i]);
		
		
		assertEquals("Contains all from collection: ", expected, obj.size());
		
	}

}
