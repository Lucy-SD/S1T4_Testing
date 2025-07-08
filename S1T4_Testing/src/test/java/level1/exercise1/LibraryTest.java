package level1.exercise1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.level1.exercise1.exceptions.BookFoundException;
import org.level1.exercise1.model.Book;
import org.level1.exercise1.model.Library;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    public Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
    }

    @Test
    public void testNewLibraryIsNotNull() {
        assertNotNull(library, "Biblioteca debe tener libros luego de ser creada.");
    }

    @Test
    public void testSizeAfterAddition() {
        try {
            library.addBook(new Book("Los Reyes del Mundo"));
            library.addBook(new Book("Los Invisibles"));
            library.addBook(new Book("Cada Vez que te Veo"));
        } catch (BookFoundException e) {
            fail("Algo ha salido mal -> " + e.getMessage());
        }
        assertEquals(3, library.getArraySize(), "La librería debería tener 3 libros" +
                " después de la inserción.");
    }

    @Test
    public void testListContainsSpecificBookInCorrectPosition() {

        try {
            library.addBook(new Book("A"));
            library.addBook(new Book("C"));
            library.addBook(new Book("B"));
        } catch (BookFoundException e) {
            fail("Algo ha salido mal -> " + e.getMessage());
        }

        assertDoesNotThrow(() -> {
            assertEquals("A", library.getBookAt(0).getTitle(), "Después de ordenar " +
                    "\"A\" debería ser primero.");
            assertEquals("B", library.getBookAt(1).getTitle(), "Después de ordenar " +
                    "\"B\" debería ser el segundo.");
            assertEquals("C", library.getBookAt(2).getTitle(), "Después de ordenar " +
                    "\"C\" debería ser el tercero.");
        }, "Excepción IndexOutOfBounds inesperada encontrada durante el llamado de getBookAt().");
    }

    @Test
    public void testNoDuplicateBookTitles() {
        Book unico = new Book("Único");

        try {
            library.addBook(unico);
        } catch (BookFoundException e) {
            fail("Algo ha salido mal -> " + e.getMessage());
        }

        assertThrows(BookFoundException.class, () -> {
            library.addBook(unico);
        }, "Se debería lanzar BookFoundException para libros duplicados.");
    }

    @Test
    public void testGetBookTitleByPosition() {
        try {
            library.addBook(new Book("Libro 1"));
            library.addBook(new Book("Libro 3"));
            Book libro2 = new Book("Libro 2");
            library.addBookAt(libro2, 1);
        } catch (BookFoundException e) {
            fail("Algo ha salido mal -> " + e.getMessage());

        }
        assertDoesNotThrow( () -> {
            assertEquals(3, library.getArraySize(), "La librería debería tener tres libros.");
            assertEquals("Libro 1", library.getBookAt(0).getTitle());
            assertEquals("Libro 2", library.getBookAt(1).getTitle());
            assertEquals("Libro 3", library.getBookAt(2).getTitle());

        }, "Excepción IndexOutOfBounds inesperada encontrada durante el llamado de getBookAt().");
    }

    @Test
    public void testSizeAfterRemoval() {
        try{
            library.addBook(new Book("Un Libro"));
            library.addBook(new Book("Otro Libro"));
            library.addBook(new Book("Tercer Libro"));
        } catch (BookFoundException e) {
            fail("Algo ha salido mal -> " + e.getMessage());
        }

        assertDoesNotThrow( () -> {
            library.removeBookByTitle("Otro Libro");
        }, "Excepción NoBooksOnLibrary/BookNotFoundException inesperada encontrada durante" +
                " el llamado de removeBookByTitle()." );

        assertEquals(2, library.getArraySize(), "La librería debe contener 2 libros.");

    }
}