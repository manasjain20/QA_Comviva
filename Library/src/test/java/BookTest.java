import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BookTest {

    @Test
    public void borrowbook() {
        LibraryCatalouge librarycatalouge = new LibraryCatalouge();

        Book book1 = new Book("Java", "Manas Jain");

        librarycatalouge.addBook(book1);
        librarycatalouge.borrowBook("Java");
        assertFalse(book1.isAvailable());
        assertFalse(librarycatalouge.getBooks().isEmpty());
        assertEquals("Manas Jain",librarycatalouge.getBooks().get(0).getAuthor());
    }

    @Test
    public void returnbook() {
        LibraryCatalouge librarycatalouge = new LibraryCatalouge();

        Book book1 = new Book("JUnit Testing", "Manas Jain");

        librarycatalouge.addBook(book1);
        librarycatalouge.borrowBook("JUnit Testing");
        librarycatalouge.returnBook("JUnit Testing");
        assertTrue(book1.isAvailable());
    }

}