package sorting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AirportTest {
	Airport o1 = new Airport("Berlin");
	Airport o2 = new Airport("Berlin");
	Airport o3 = new Airport("Paris");
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCompare() {
		assertTrue("test egal",o1.compare(o1,o2)==0);
		assertFalse("test fail egal",o1.compare(o2,o3)==0);
		assertTrue("test plus grand",o1.compare(o3,o1)>=1);
		assertFalse("test plus petit",o1.compare(o1,o3)>=1);
	}

	@Test
	public void testCompareTo() {
		assertTrue("test egal",o1.compareTo(o2)==0);
		assertFalse("test fail egal",o2.compareTo(o3)==0);
		assertTrue("test plus grand",o3.compareTo(o1)>=1);
		assertFalse("test plus petit",o1.compareTo(o3)>=1);
	}

}
