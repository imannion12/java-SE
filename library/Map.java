package library;

public class Map extends Item implements Document{

	// ATTRIBUTES
	String countyLocation;

	// CONSTRUCTORS

	public String getcountyLocation() {
		return this.countyLocation;
	}

	public void setcountyLocation(String countyLocation) {
		this.countyLocation = countyLocation;
	}

	public Map(int itemID, String name, String countyLocation) {
		super(itemID, name);
		this.countyLocation = countyLocation;
	}

	public void output(){
		System.out.println("Each map has a unique Location" + countyLocation);
	}
}
