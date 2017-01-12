package library;

public class Book extends Item {

	// ATTRIBUTES

	String author;

	// CONSTRUCTORS

	public String getauthor() {
		return this.author;
	}

	public void setauthor(String author) {
		this.author = author;
	}

	public Book(int itemID, String name, String author) {
		super(itemID, name);
		this.author = author;
	}

}
