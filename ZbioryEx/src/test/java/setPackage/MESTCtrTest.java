package setPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import setPackage.MyExtendedSet;

public class MESTCtrTest {
	
	@Test
	public void test1(){
		MyExtendedSet<Integer> a = new MyExtendedSet<Integer>();
		assertEquals(a.size(),0);
		
	}
	@Test
	public void test2(){
		MyExtendedSet<Integer> a = new MyExtendedSet<Integer>(new Integer[]{2,3});
		assertEquals(a.size(),2);
		
	}
	@Test
	public void test3(){
		MyExtendedSet<Integer> a = new MyExtendedSet<Integer>(1,2,3);
		assertEquals(a.size(),3);		
	}
}
