package sorting;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import collections.Airport;
import collections.SearchingClass;

public class SearchingClassTest {
	public List<Airport> data;
	Airport result;
	
	@Before
	public void setUp() throws Exception {
		data=Arrays.asList(new Airport("Berlin"), new Airport("Catane"), new Airport("New york"), new Airport("Moscow"), new Airport("Paris"));
	}

	@Test
	public void testLinearSearch() {
		result=SearchingClass.linearSearch("Paris",data);
		assertTrue("LinearSearch trouve", "Paris".equals(result.getShortName()));
		result=SearchingClass.linearSearch("Caen",data);
		assertNull("LinearSearch ne trouve pas", result);
	}

	@Test
	public void testBinarySearch() {
		result=SearchingClass.binarySearch("Paris",(Airport[]) data.toArray());
		assertTrue("LinearSearch trouve", "Paris".equals(result.getShortName()));
		result=SearchingClass.binarySearch("Caen",(Airport[]) data.toArray());
		assertNull("LinearSearch ne trouve pas", result);
	}

}
