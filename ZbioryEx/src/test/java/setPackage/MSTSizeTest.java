package setPackage;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import setpackage.MySet;

@RunWith(Parameterized.class)
public class MSTSizeTest {
	Integer[] a;
	int size;
	boolean expected;
	
	@Parameters
    public static Collection<Object[]> data() {
    	
    	return Arrays.asList(new Object[][]
    			{ 	{ new Integer[]{}, 0, true },
    				{ new Integer[]{}, 1, false },
    				{ new Integer[]{0,1,2,3}, 4, true },
    				{ new Integer[]{0,1,2,3}, 0, false},    				
    			} );
    }
    public MSTSizeTest(Integer[] a, int size, boolean expected){
		this.a = a;
		this.size = size;
		this.expected = expected;
	}
    @Test
	public void test() {
		
		MySet<Integer> objA = new MySet<Integer>(a);
		
		
		assertEquals("test size: ", expected, objA.size() == size);
	}
}
