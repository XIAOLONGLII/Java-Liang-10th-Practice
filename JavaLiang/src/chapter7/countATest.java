package chapter7;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countATest {

	@Test
	void test() {
		JunitTest test = new JunitTest();
		int output = test.countA("America");
		assertEquals(2,output);
	}

}
