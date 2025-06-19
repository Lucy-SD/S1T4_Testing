package org.level1.exercise1;

import org.level1.exercise1.exceptions.BookFoundException;
import org.level1.exercise1.exceptions.BookNotFoundException;
import org.level1.exercise1.exceptions.NoBooksOnLibraryException;
import org.level1.exercise1.model.Book;
import org.level1.exercise1.model.Library;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Book book1 = new Book("Inés del Alma Mía");
        Book book2 = new Book("Reinventa las Reglas");
        Book book3 = new Book("A Cuento de Nada");
        Book book4 = new Book("Jugando al Olvido");
        String answer;


        System.out.println("\n   --- Ver Libros en Biblioteca vacía ---  ");
        try {
            answer = library.seeBooks();
        } catch (NoBooksOnLibraryException e) {
            answer = e.getMessage();
        }
        System.out.println(answer);


        System.out.println("\n   *** Añadir Libros *** ");
        try {
            library.addBook(book1);
            answer = "Libro: " + book1.getTitle() + ", añadido correctamente.";
        } catch (BookFoundException e) {
            answer = e.getMessage();
        }
        System.out.println(answer);

        try {
            library.addBook(book2);
            answer = "Libro: " + book2.getTitle() + ", añadido correctamente.";
        } catch (BookFoundException e) {
            answer = e.getMessage();
        }
        System.out.println(answer);

        try {
            library.addBook(book3);
            answer = "Libro: " + book3.getTitle() + ", añadido correctamente.";
        } catch (BookFoundException e) {
            answer = e.getMessage();
        }
        System.out.println(answer);

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
        try {
            library.removeBookByTitle("Inés del Alma Mía");
            answer = "Libro: Inés del Alma Mía eliminado correctamente.";
        } catch (NoBooksOnLibraryException | BookNotFoundException e) {
            answer = e.getMessage();
        }
        System.out.println(answer);
        try {
            library.removeBookByTitle("Reinventa las Reglas");
            answer = "Libro: Reinventa las Reglas eliminado correctamente.";
        } catch (NoBooksOnLibraryException | BookNotFoundException e) {
            answer = e.getMessage();
        }
        System.out.println(answer);
        try {
            library.removeBookByTitle("A Cuento de Nada");
            answer = "Libro: A Cuento de Nada eliminado correctamente.";
        } catch (NoBooksOnLibraryException | BookNotFoundException e) {
            answer = e.getMessage();
        }
        System.out.println(answer);
        try {
            library.removeBookByTitle("Jugando al Olvido");
            answer = "Libro: Jugando al Olvido eliminado correctamente.";
        } catch (NoBooksOnLibraryException | BookNotFoundException e) {
            answer = e.getMessage();
        }
        System.out.println(answer);


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

