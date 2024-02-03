package Lab03;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlgoTest {

	@Test
	public void test1() {
		var Algo = new Algo();
		int result = Algo.MaxCycle(1, 10);
		assertEquals(20, result);
	}
	@Test
	public void Boundary() {
		var Algo = new Algo();
		int result = Algo.MaxCycle(1, 100000);
		assertEquals(351, result);
	}
	@Test
	public void SameNum() {
		var Algo = new Algo();
		int result = Algo.MaxCycle(5, 5);
		assertEquals(0, result);
	}
	@Test
	public void Ones() {
		var Algo = new Algo();
		int result = Algo.MaxCycle(1, 1);
		assertEquals(0, result);
	}
	@Test
	public void Negatives() {
		var Algo = new Algo();
		int result = Algo.MaxCycle(-1, 10);
		assertEquals(20, result);
	}


}
