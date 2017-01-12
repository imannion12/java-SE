package library;

import static org.junit.Assert.*;
import org.junit.Test;



public class FunctionTest {
	
	    
	    
	    //need to create a list called register.list, within librarian class
	    //Within Librarian class, create method called registerPerson
	    //within registerPerson method, add firstName and Surname of person to registerList
	
	    @Test
	    public void testRegisterPerson(){
		Librarian  a = new Librarian("Stephen", "James", "1");
		a.registerCustomer("Elliot","Womack", 1);
		int answer = a.registerList.size();
	    assertEquals(answer, 1);
	    }

	   //Within Librarian class, use method called registerPerson
       //within registerPerson method, delete person from registerList
	
	    @Test
	    public void testDeletePerson(){
	    Librarian  b = new Librarian("Stephen", "James", "1");
	    b.registerCustomer("Ian", "Mannion", 2);
	    b.registerCustomer("Elliot","Womack", 1);
	    b.deleteCustomer("Ian", "Mannion", 2);
        int answer = b.registerList.size();
        assertEquals(answer, 1);
	    }

	    //Within Librarian class, use method called updatePerson
	    //within updatePerson method, update person to registerList
	    
	    @Test
	    public void testUpdatePerson(){
	    Librarian  c = new Librarian("Stephen", "James", "1");
	    c.registerCustomer("Elliot", "Womack", 1);
	    c.updateCustomer("Elliot", "Womack", 1, "Jamie", "Brown", 1);
        assertEquals("James", c.surname);
        }
	    
	    
	    //Within Librarian class, we use method called addItem
	    //need to create a list called itemList, within librarian class
	    //within addItem method, add itemID and Name to itemList
	  
	    
	    @Test
	    public void testaddItem(){
	    Librarian d = new Librarian("Stephen", "James", "1");
	    d.addItem(2, "PJ Party", "JK Rowling");
	    d.addItem(4, "Walrus", "JK rowling");
	    int answer = d.itemList.size();
        assertEquals(answer, 2);
	    }
	    
	    
	    //Within Librarian class, we use method called removeItem
	    //within removeItem method, remove itemID and Name from itemList
	    
	    @Test
	    public void testremoveItem(){
	    Librarian e = new Librarian("Stephen", "James", "1");
	    e.addItem(1, "Java Monster", "JK Rowling");
	    e.addItem(3, "Jungle Book", "Ralph john");
	    e.removeItem(1, "Java Monster", "JK Rowling");
	    int answer = e.itemList.size();
        assertEquals( answer, 1);
	    }
	    
        //within  person class create method out
	    //need to create list called checkOut within out method
	    //remove itemID Name from itemList and put into checkOut list 
        
	    
	    @Test
	    public void testcheckOut(){
	    Librarian f = new Librarian("Stephen", "James", "1");
	    f.addItem(2, "PJ Party", "Lancashire");
	    f.checkOut(2, "PJ Party", "Lancashire");
	    int answer = f.checkOutList.size();
        assertEquals(answer, 1);
	    }
	    
	    
	    
	 
	    
	    @Test
	    public void testcheckIn(){
	    Librarian g = new Librarian("Stephen", "James", "1");
	    g.addItem(2, "PJ Party","Stan James");
	    g.checkIn(2, "PJ Party","Stan james");
	    int answer = g.itemList.size();
        assertEquals(answer, 1);
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}
