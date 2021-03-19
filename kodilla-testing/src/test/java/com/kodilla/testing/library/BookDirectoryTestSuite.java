package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {

    private List<Book> generateListOfBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title" + n, "Author" + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @Test
    void testListBooksWithConditionsReturnList() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    void testListBooksWithConditionMoreThan20() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfBooks(15);
        List<Book> resultListOf40Books = generateListOfBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());


    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    void testListBooksInHandsOfBooks() {

        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> theListOf0Books = new ArrayList<>();
        List<Book> theListOf1Book = generateListOfBooks(1);
        List<Book> theListOf5Books = generateListOfBooks(5);

        LibraryUser libraryUser0 = new LibraryUser("User0", "LastName0", "000");
        LibraryUser libraryUser1 = new LibraryUser("User1", "LastName1", "111");
        LibraryUser libraryUser5 = new LibraryUser("User5", "LastName5", "555");

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser0)).thenReturn(theListOf0Books);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(theListOf1Book);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser5)).thenReturn(theListOf5Books);


        List<Book> zeroBooks = bookLibrary.listBooksInHandsOf(libraryUser0);
        List<Book> oneBook = bookLibrary.listBooksInHandsOf(libraryUser1);
        List<Book> fiveBooks = bookLibrary.listBooksInHandsOf(libraryUser5);

        assertEquals(0, zeroBooks.size());
        assertEquals(1, oneBook.size());
        assertEquals(5, fiveBooks.size());


    }

}