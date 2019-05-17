import static org.junit.Assert.*;

import org.junit.Test;

public class SueldoTest {
	
	Sueldo sueldo = new Sueldo();

	@Test
	public void test1() {
		assertEquals(1000, sueldo.calculaBruto('F', 1000), 0.01);
	}
	
	@Test
	public void test2() {
		assertEquals(1300, sueldo.calculaBruto('F', 6000), Double.MIN_VALUE);
	}
	
	@Test
	public void test3() {
		assertEquals(300, sueldo.calculaBruto('E', 2000), 0.01);
	}
	
	@Test
	public void test4() {
		assertEquals(650, sueldo.calculaBruto('E', 4000), 0.01);
	}
	
	@Test
	public void test5() {
		assertEquals(1100, sueldo.calculaBruto('E', 6000), 0.01);
	}
	
	@Test
	public void test6() {
		assertEquals(50, sueldo.calculaRet('E', 1000), Double.MIN_VALUE);
	}
	
	@Test
	public void test7() {
		assertEquals(50, sueldo.calculaRet('F', 1000), 0.01);
	}
	
	@Test
	public void test8() {
		assertEquals(110, sueldo.calculaRet('F', 1100), 0.01);
	}
	
	@Test
	public void test9() {
		assertEquals(210, sueldo.calculaRet('F', 1400), 0.01);
	}

}
