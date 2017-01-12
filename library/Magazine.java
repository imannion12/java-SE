package library;

public class Magazine extends Item {

	// ATTRIBUTES

	int issueNumber;

	// CONSTRUCTORS

	public int getissueNumber() {
		return this.issueNumber;
	}

	public void setissueNumber(int issueNumber) {
		this.issueNumber = issueNumber;
	}

	public Magazine(int itemID, String name, int issueNumber) {
		super(itemID, name);
		this.issueNumber = issueNumber;
	}

}
