package sorting;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SortingClassTest {
	public List<Airport> result;
	
	@Before
	public void setUp() throws Exception {
		result=Arrays.asList(new Airport("Berlin"), new Airport("Catane"), new Airport("Moscow"), new Airport("New york"), new Airport("Paris"));
	}

	@Test
	public void testSelectionSort() {
		List<Airport> data =Arrays.asList(new Airport("Catane"), new Airport("Berlin"), new Airport("New york"), new Airport("Moscow"), new Airport("Paris"));
		Airport [] sorted = SortingClass.selectionSort((Airport[]) data.toArray());
		assertArrayEquals(result.toArray(), sorted);
	}
}
