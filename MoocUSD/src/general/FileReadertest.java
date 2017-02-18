package general;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadertest {
	String datafile;
	public FileReadertest() {
		datafile = "data/airports.dat";
	}
	
	/**
	 * read file in byte
	 */
	public void readfilein8bit(){
		FileInputStream reader=null;
		try {
			reader = new FileInputStream(datafile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int c=-1;
		try {
			while ((c = reader.read())!=-1) {
				System.out.println(c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readfilein16bit(){
		FileReader reader=null;
		try {
			reader = new FileReader(datafile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int c=-1;
		try {
			while ((c = reader.read())!=-1) {
				System.out.println(c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readfileinline(){
		FileInputStream fis=null;
		BufferedReader br=null;
		try {
			fis = new FileInputStream(datafile);
			br = new BufferedReader(new InputStreamReader(fis));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String line;
		try {
			while ((line = br.readLine())!=null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
