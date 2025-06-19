package org.level1.exercise1.exceptions;

public class BookFoundException extends Exception {
    public BookFoundException() {
        super("Error encontrado: el Libro solicitado ya forma parte de la Biblioteca.");
    }
}
