package org.level1.exercise1.exceptions;

public class NoBooksOnLibraryException extends Exception {
    public NoBooksOnLibraryException() {
        super("Error encontrado: no hay Libros añadidos en la Biblioteca aún.");
    }
}
