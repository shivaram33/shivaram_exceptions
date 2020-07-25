package maven4;

import static org.junit.Assert.*;

import org.junit.Test;

public class testinterest {
	
	@Test
	public void test() {
		Interest test=new Interest();
		double output=test.Simple(1000, 5,2);
		assertEquals(100.0,output,0);
	}

}
