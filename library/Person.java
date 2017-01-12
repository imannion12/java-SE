package library;

import java.util.ArrayList;
import java.util.List;

public abstract class Person {

	// ATTRIBUTES
	public List<Book> itemList = new ArrayList<Book>();
	public List<Book> checkOutList = new ArrayList<Book>();

	String firstName;
	String surname;

	// CONSTRUCTORS

	public String getfirstName() {
		return this.firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getsurname() {
		return this.surname;
	}

	public void setsurname(String surname) {

		this.surname = surname;
	}

	public Person(String firstName, String surname) {
		this.firstName = firstName;
		this.surname = surname;
	}

	public void checkOut(int itemID, String name, String author) {

		for (Book b : itemList) {
			if (b.itemID == itemID && b.name == name
					&& b.author == author) {
				checkOutList.add(b);}}}
			
			
		
public void checkIn(int itemID, String name, String author) {

				for (Book b : itemList) {
					if (b.itemID == itemID && b.name == name
							&& b.author == author) {
						checkOutList.remove(b);
			}
		}

		// METHODS (CheckIN, CheckOut)
	}
}
