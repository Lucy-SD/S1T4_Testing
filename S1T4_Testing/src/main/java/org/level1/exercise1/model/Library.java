package org.level1.exercise1.model;

import org.level1.exercise1.exceptions.BookFoundException;
import org.level1.exercise1.exceptions.BookNotFoundException;
import org.level1.exercise1.exceptions.NoBooksOnLibraryException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library {//métodos

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public int getArraySize() {
        if (books.isEmpty()) {
            return 0;
        }
        return books.size();
    }

    private void sortBooks() {
        books.sort(Comparator.comparing(Book::getTitle));
    }

    public void addBook(Book book) throws BookFoundException {
        if (books.contains(book)) {
            throw new BookFoundException();
        } else {
            books.add(book);
            sortBooks();
        }
    }

    public String seeBooks() throws NoBooksOnLibraryException {
        StringBuilder answer = new StringBuilder();
        if (books.isEmpty()) {
            throw new NoBooksOnLibraryException();
        } else {
            for (Book book : books) {
                answer.append(book.toString());
            }
        }
        return answer.toString();
    }

    public void addBookAt(Book book, int index) throws BookFoundException, IndexOutOfBoundsException {
        if (books.contains(book)) {
            throw new BookFoundException();
        } else if (index < 0 || index >= books.size()) {
            throw new IndexOutOfBoundsException("Error encontrado: el Índice solicitado no es válido.");
        } else {
            this.books.add(index, book);
        }
    }

    public Book getBookAt(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= books.size()) {
            throw new IndexOutOfBoundsException("Error encontrado: el Índice solicitado no es válido.");
        } else {
            return books.get(index);
        }
    }

    public int findBookByTitle(String title) throws NoBooksOnLibraryException {
        int i = 0;
        if (books.isEmpty()) {
            throw new NoBooksOnLibraryException();
        }
        while (i < books.size()) {
            if (title.equalsIgnoreCase(books.get(i).getTitle())) {
                return i;
            }
            i++;
        }
        return -1;

    }

    public void removeBookByTitle(String title) throws NoBooksOnLibraryException, BookNotFoundException {
        int index = findBookByTitle(title);
        if (index == -1) {
            throw new BookNotFoundException();
        } else {
            books.remove(books.get(index));
        }
    }
}




