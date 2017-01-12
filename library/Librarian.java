package library;

import java.util.ArrayList;
import java.util.List;

public class Librarian extends Person {

	public List<Customer> registerList = new ArrayList<Customer>();
	
	// ATTRIBUTES

	String employeeID;

	// CONSTRUCTOR

	public String employeeID() {
		return this.employeeID;
	}

	public void employeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public Librarian(String firstName, String surname, String employeeID) {
		super(firstName, surname);
		this.employeeID = employeeID;
	}

	// Methods

	public void registerCustomer(String firstName, String surname,
			int customerID) {
		Customer p = new Customer(firstName, surname, customerID);

		registerList.add(p);
	}

	public void deleteCustomer(String firstName, String surname, int customerID) {
		// Customer p = new Customer(firstName, surname, customerID);

		for (Customer p : registerList) {
			if (p.firstName == firstName && p.surname == surname
					&& p.customerID == customerID) {
				registerList.remove(p);
			}
		}

	}

	public void updateCustomer(String firstName, String surname,
			int customerID, String newFname, String newSname, int newCID) {

		Customer p = new Customer(firstName, surname, customerID);

		if (p.firstName == firstName && p.surname == surname
				&& p.customerID == customerID) {
			p.firstName = newFname;
			p.surname = newSname;
			p.customerID = newCID;
		}
	}

	public void addItem(int itemID, String name, String author) {
		Book b = new Book(itemID, name, author);

		itemList.add(b);
	}

	public void removeItem(int itemID, String name, String author) {
		for (Book b : itemList) 
			if (b.itemID == itemID && b.name.equals(name) && b.author.equals(author)) {

				itemList.remove(b);
				
			}
		}
	}








