package com.qatelran.org.lessonseventeen.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookStorageTest {

    private BookStorage storage = new BookStorage();

    @Test
    void getBookByNameWhenBookExists() {
        String bookName = "Lord of the ring";
        Book book = storage.getBookByName(bookName);
        assertEquals(bookName, book.getName());
    }

    @Test
    void getBookByNameWhenBookIsNotExists() {
        String bookName = "la-la-la";
        assertThrows(BookNotFoundException.class, () -> storage.getBookByName(bookName));
    }

    @Test
    void getBookByNameWhenBookNameIsNull() {
        assertThrows(IncorrectBookNameException.class, () -> storage.getBookByName(null));
    }

    @Test
    void getBookByNameWhenBookNameIsEmpty() {
        assertThrows(IncorrectBookNameException.class, () -> storage.getBookByName(""));
    }

    @Test
    void getBookByNameWhenBookNameStartWithIncorrectSymbol() {
        String name = "-Dune";
        assertThrows(IncorrectBookNameException.class, () -> storage.getBookByName(name));
    }
}