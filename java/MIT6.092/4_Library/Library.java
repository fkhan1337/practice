/**************************************************

Author: Farhan Khan
Email: fkhan.1337@gmail.com
Source: MIT 6.092 Assignments.

 *************************************************/

public class Library {
    // Add the missing implementation to this class
    String address;
    Book[] books;
    int currentBookCount;
    
    // Static variables (timings)
    static int openingHour = 9;
    static int closingHour = 5;

    Library(String addr) {
	address = addr;
	books = new Book[100];
	currentBookCount = 0;
    }

    void addBook (Book book) {
	books[currentBookCount] = book;
	currentBookCount++;
    }

    void printAddress() {
	System.out.println(address);
    }

    void borrowBook(String title) {
	for (int i=0; i<currentBookCount; i++) {
	    if (title.equals(books[i].getTitle())) {
		if (books[i].isBorrowed() == false) {
		    books[i].borrowed();
		    System.out.println("Enjoy the Book!");
		} else {
		    System.out.println("Sorry, the book is already borrowed.");
		}
		return;
	    }
	}
	System.out.println("Sorry we don't have that book in our catalog.");
    }

    void printAvailableBooks() {
	if (currentBookCount == 0) {
	    System.out.println("No Books in Library.");
	    return;
	}
	for (int i=0; i<currentBookCount; i++) {
	    if (books[i].isBorrowed() == false)
		System.out.println(books[i].getTitle());
	}
    }

    void returnBook(String title) {
	for (int i=0; i<currentBookCount; i++) {
	    if (title.equals(books[i].getTitle()) && books[i].isBorrowed() == true) {
		books[i].returned();
		System.out.println("Thanks for returning.");
		return;
	    }
	}
	System.out.println("Error: No such book: " + title);
    }

    static void printOpeningHours() {
	System.out.println("The library opens at: " + openingHour);
    }

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
} 
