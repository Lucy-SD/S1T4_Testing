package org.level1.exercise1;

import org.level1.exercise1.exceptions.BookFoundException;
import org.level1.exercise1.exceptions.BookNotFoundException;
import org.level1.exercise1.exceptions.NoBooksOnLibraryException;
import org.level1.exercise1.model.Book;
import org.level1.exercise1.model.Library;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("Inés del Alma Mía");
        Book book2 = new Book("Reinventa las Reglas");
        Book book3 = new Book("A Cuento de Nada");
        Book book4 = new Book("Jugando al Olvido");

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        String answer;

        System.out.println("\n   --- Ver Libros en Biblioteca vacía ---  ");
        try {
            answer = library.seeBooks();
        } catch (NoBooksOnLibraryException e) {
            answer = e.getMessage();
        }
        System.out.println(answer);


        System.out.println("\n   *** Añadir Libros *** ");
        for (Book book : books) {
            try {
                library.addBook(book);
                System.out.println("Libro: " + book.getTitle() + ", añadido correctamente.");
            } catch (BookFoundException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\n   ---- Testeo añadir Libro existente --- ");
        try {
            library.addBook(book1);
            answer = "Libro: " + book1.getTitle() + ", añadido correctamente.";
        } catch (BookFoundException e) {
            answer = e.getMessage();
        }
        System.out.println(answer);

        System.out.println("\n   *** Ver Libros *** ");
        try {
            answer = library.seeBooks();
        } catch (NoBooksOnLibraryException e) {
            answer = e.getMessage();
        }
        System.out.println(answer);

        System.out.println("\n   --- Búsqueda por Índice Incorrecto --- ");
        try {
            answer = "El título del libro solicitado es: " + library.getBookAt(5).getTitle();
        } catch (IndexOutOfBoundsException e) {
            answer = e.getMessage();
        }
        System.out.println(answer);

        System.out.println("\n   *** Búsqueda por Índice Correcto *** ");
        try {
            answer = "El título del libro solicitado es: " + library.getBookAt(2).getTitle();
        } catch (IndexOutOfBoundsException e) {
            answer = e.getMessage();
        }
        System.out.println(answer);


        System.out.println("\n   --- Añadir Libro en Índice Incorrecto --- ");
        try {
            library.addBookAt(book4, 7);
            answer = "Libro: " + book4.getTitle() + ", añadido correctamente.";
        } catch (BookFoundException | IndexOutOfBoundsException e) {
            answer = e.getMessage();
        }
        System.out.println(answer);

        System.out.println("\n   *** Añadir Libro en Índice Correcto ***");
        try {
            library.addBookAt(book4, 2);
            answer = "Libro: " + book4.getTitle() + ", añadido correctamente.";
        } catch (BookFoundException | IndexOutOfBoundsException e) {
            answer = e.getMessage();
        }
        System.out.println(answer);

        books.add(book4);

        System.out.println("\n   --- Añadir Libro existente en Índice Correcto --- ");
        try {
            library.addBookAt(book2, 1);
            answer = "Libro: " + book2.getTitle() + ", añadido correctamente.";
        } catch (BookFoundException | IndexOutOfBoundsException e) {
            answer = e.getMessage();
        }
        System.out.println(answer);


        System.out.println("\n   *** Ver Libros de la Biblioteca *** ");
        try {
            answer = library.seeBooks();
        } catch (NoBooksOnLibraryException e) {
            answer = e.getMessage();
        }
        System.out.println(answer);


        System.out.println("\n   --- Eliminar Libro inexistente --- ");
        try {
            library.removeBookByTitle("Carpincha");
            answer = "Libro: Carpincha eliminado correctamente.";
        } catch (NoBooksOnLibraryException | BookNotFoundException e) {
            answer = e.getMessage();
        }
        System.out.println(answer);


        System.out.println("\n   *** Eliminar Libro *** ");
        for (Book book : books) {
            try {
                library.removeBookByTitle(book.getTitle());
                System.out.println("Libro: " + book.getTitle() + " eliminado correctamente.");
            } catch (NoBooksOnLibraryException | BookNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\n   --- Eliminar Libro en Biblioteca vacía --- ");
        try {
            library.removeBookByTitle("A Cuento de Nada");
            answer = "Libro: A Cuento de Nada eliminado correctamente.";
        } catch (NoBooksOnLibraryException | BookNotFoundException e) {
            answer = e.getMessage();
        }
        System.out.println(answer);

    }
}
