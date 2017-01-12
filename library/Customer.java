package library;

public class Customer extends Person implements Document {

	// ATTRIBUTES

	int customerID;

	// CONSTRUSTOR

	public int getcustomerID() {
		return this.customerID;
	}

	public void setcustomerID(int customerID) {
		this.customerID = customerID;
	}

	public Customer(String firstName, String surname, int customerID) {
		super(firstName, surname);
		this.customerID = customerID;
	}
	
	public void output(){
		System.out.println("Every customer has a unique customerID" +customerID);
	}
	
}
