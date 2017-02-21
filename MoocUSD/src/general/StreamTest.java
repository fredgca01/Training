package general;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import sorting.Airport;

public class StreamTest {

	public void testStreamWithAirport() {
		List<Airport> data=null;
		
		try {
			data = fileParsing();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Stream<Airport> stream = data.stream();
		Stream result = stream.filter(item -> item.getShortName().equalsIgnoreCase("Paris"));
		Iterator ite = result.iterator();
		while (ite.hasNext()){
			System.out.println(ite.next());
		}
		
	}
	
	public List fileParsing() throws IOException {
		String datafile = "data/airports.dat";
		List<Airport> data = new ArrayList<Airport>();
		
		FileInputStream fis = new FileInputStream(datafile);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line;
		while ((line = br.readLine()) != null) {
			//
			String[] result = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
			for (int i = 0; i < result.length; i++) {
				result[i] = result[i].replace("\"", "");
			}
			Airport place = new Airport();
			place.setName(result[1]);
			place.setShortName(result[2]);
			place.setCountry(result[3]);
			place.setCode1(result[4]);
			place.setCode2(result[5]);
			place.setLatitude(Double.parseDouble(result[6]));
			place.setLongitude(Double.parseDouble(result[7]));
			place.setAltitude(Integer.parseInt(result[8]));
			place.setTimezone(Float.parseFloat(result[9]));
			place.setDst(result[10].charAt(0));
			place.setDbTimezone(result[11]);
			data.add(place);
		}
		return data;
	}
}
