package maven4;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testCompound {

	@Test
	void test() {
		Interest test=new Interest();
		double output=test.Compound(1000, 5,2);
		assertEquals(104.08080319999999,output,0);
	}

}
