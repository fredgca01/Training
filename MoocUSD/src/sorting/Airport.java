package sorting;

import java.util.Comparator;

public class Airport implements Comparable<Airport>, Comparator<Airport> {
	
	private String name;
	private String shortName;
	private String country;
	private String code1;
	private String code2;
	private double latitude;
	private double longitude;
	private int altitude;
	private float timezone;
	private char dst;
	private String dbTimezone;
	
	public Airport(){
	}
	
	public Airport(String shortname){
		this.shortName=shortname;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCode1() {
		return code1;
	}
	public void setCode1(String code1) {
		this.code1 = code1;
	}
	public String getCode2() {
		return code2;
	}
	public void setCode2(String code2) {
		this.code2 = code2;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public int getAltitude() {
		return altitude;
	}
	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
	public float getTimezone() {
		return timezone;
	}
	public void setTimezone(float timezone) {
		this.timezone = timezone;
	}
	public char getDst() {
		return dst;
	}
	public void setDst(char dst) {
		this.dst = dst;
	}
	public String getDbTimezone() {
		return dbTimezone;
	}
	public void setDbTimezone(String dbTimezone) {
		this.dbTimezone = dbTimezone;
	}
	
	@Override
	public String toString() {
		return shortName;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.getShortName().equals(((Airport) obj).getShortName()); 
	}

	@Override
	public int compare(Airport o1, Airport o2) {
		return o1.getShortName().compareTo(o2.getShortName());
	}

	@Override
	public int compareTo(Airport o) {
		return this.getShortName().compareTo(o.getShortName());
	}
	
}
