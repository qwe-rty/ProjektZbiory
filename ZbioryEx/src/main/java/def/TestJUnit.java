package def;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;


public class TestJUnit {
	
	public TestJUnit()
	{
		
	}
	
	@Test
	public void test1()
	{
		Testowa obj = new Testowa();
		
		assertEquals("Hello world", 3, obj.getSth());
	}
	
		

}
