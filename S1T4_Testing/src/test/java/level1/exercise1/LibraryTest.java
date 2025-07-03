package level1.exercise1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.level1.exercise1.exceptions.BookFoundException;
import org.level1.exercise1.exceptions.BookNotFoundException;
import org.level1.exercise1.exceptions.NoBooksOnLibraryException;
import org.level1.exercise1.model.Book;
import org.level1.exercise1.model.Library;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    public Library library;

    @BeforeEach
    public void setUp() {
        System.out.println("Generando una nueva Biblioteca . . .");
        library = new Library();
        System.out.println("Biblioteca creada " + ((library != null) ? "correctamente." : "incorrectamente."));
    }

    @Test
    public void testNewLibraryIsNotNull() {
        assertNotNull(library, "Biblioteca debe tener libros luego de ser creada.");
        System.out.println("La Biblioteca se ha generado y no es nula.\n");
    }

    @Test
    public void testSizeAfterAddition() throws BookFoundException {
        library.addBook(new Book("Los Reyes del Mundo"));
        library.addBook(new Book("Los Invisibles"));
        library.addBook(new Book("Cada Vez que te Veo"));

        assertEquals(3, library.getArraySize(), "La librería debería tener 3" +
                " libros después de la inserción");
        System.out.println("Testeo finalizado con éxito. La Biblioteca tiene el tamaño esperado luego de la adición de " +
                "varios Libros.\n");
    }

    @Test
    public void testListContainsSpecificBookInCorrectPosition() throws BookFoundException {
        library.addBook(new Book("A"));
        library.addBook(new Book("C"));
        library.addBook(new Book("B"));

        assertEquals("A", library.getBookAt(0).getTitle(), "First should be" +
                "\"A\" after sorting");
        assertEquals("B", library.getBookAt(1).getTitle(), "Second should be " +
                "\"B\" after sorting");
        assertEquals("C", library.getBookAt(2).getTitle(), "Third should be " +
                "\"C\" after sorting");

        System.out.println("Testeo finalizado con éxito. La Biblioteca se ordena de forma alfabética correctamente" +
                " al añadir libros.\n");
    }

    @Test
    public void testNoDuplicateBookTitles() throws BookFoundException {
        Book unico = new Book("Único");
        library.addBook(unico);

        Exception e = assertThrows(BookFoundException.class, () -> {
            library.addBook(unico);
        });

        assertNotNull(e, "BookFoundException should be thrown for duplicate books");
        System.out.println("Testeo finalizado con éxito. La Biblioteca no admite duplicar títulos.\n");
    }

    @Test
    public void testGetBookTitleByPosition() throws BookFoundException {
        library.addBook(new Book("Libro 1"));
        library.addBook(new Book("Libro 3"));
        Book libro2 = new Book("Libro 2");

        library.addBookAt(libro2, 1);

        assertEquals(3, library.getArraySize(), "La librería debería tener tres libros.");
        assertEquals("Libro 1", library.getBookAt(0).getTitle());
        assertEquals("Libro 2", library.getBookAt(1).getTitle());
        assertEquals("Libro 3", library.getBookAt(2).getTitle());

        System.out.println("Testeo finalizado con éxito. La Biblioteca devuelve el título correspondiente" +
                " a la posición del Libro.\n");
    }

    @Test
    public void testSizeAfterRemoval() throws BookFoundException, NoBooksOnLibraryException, BookNotFoundException {
        library.addBook(new Book("Un Libro"));
        library.addBook(new Book("Otro Libro"));
        library.addBook(new Book("Tercer Libro"));

        library.removeBookByTitle("Otro Libro");

        assertEquals(2, library.getArraySize(), "La librería debe contener 2 libros.");

        System.out.println("Testeo finalizado con éxito. Al eliminar un Libro, el tamaño de la Biblioteca se actualiza" +
                " correctamente.\n");
    }
}