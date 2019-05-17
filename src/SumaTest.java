import static org.junit.Assert.*;

import org.junit.Test;

public class SumaTest {
	Suma suma = new Suma(2);

	@Test
	public void test() {
		assertEquals(8, suma.anadir(3));
	}
	
	@Test
	public void test1() {
		assertEquals(9, suma.anadir(3));
	}

}
