package spring.aop;

public class Country {
	private String countryName;
	private String countryCapital;
	public void getCountryName() {
		System.out.println(this.countryName);;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public void getCountryCapital() {
		System.out.println(this.countryCapital);;
	}
	public void setCountryCapital(String countryCapital) {
		this.countryCapital = countryCapital;
	}
	

}
