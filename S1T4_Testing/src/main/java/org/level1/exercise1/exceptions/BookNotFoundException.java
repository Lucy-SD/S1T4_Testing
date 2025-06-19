package org.level1.exercise1.exceptions;

public class BookNotFoundException extends Exception {
    public BookNotFoundException() {
        super("Error encontrado: el Libro solicitado no está en la Biblioteca.");
    }
}
