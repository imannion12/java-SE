package library;

public abstract class Item {

	// ATTRIBUTES

	int itemID;
	String name;

	// CONSTRUCTORS

	public int getitemID() {
		return this.itemID;
	}

	public void setitemID(int itemID) {
		this.itemID = itemID;
	}

	public String getname() {
		return this.name;
	}

	public void setname(String name) {
		this.name = name;

	}

	public Item(int itemID, String name) {
		this.itemID = itemID;
		this.name = name;
	}

}
