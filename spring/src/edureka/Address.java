package edureka;

public class Address {
	String city;
	String state;
	int zipCode;
	
	public Address() {
		System.out.println("Empty Address Constructor Called");
	}

	public Address(String city, String state, int zipCode) {
		System.out.println("Arg Address Constructor Called!");
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}
}
