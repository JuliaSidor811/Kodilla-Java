package com.kodilla.stream.book;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class BookTestSuite {
    @Test
    void testGetListUsingFor(){
        BookDirectory bookDirectory = new BookDirectory();
        List<Book> books = bookDirectory.getList();
        int nummberOfBooksPublicatedAfter2007 = 0;
        for(Book book: books){
            if(book.getYearOfPublication() > 2007){
                nummberOfBooksPublicatedAfter2007++;
            }
        }
        assertEquals(3,nummberOfBooksPublicatedAfter2007);
    }
    @Test
    void testGetListUsingIntStream() {
        BookDirectory bookDirectory = new BookDirectory();
        List<Book> books = bookDirectory.getList();
        int numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())
                .filter(n -> books.get(n).getYearOfPublication() > 2007)
                .map(n -> 1)
                .sum();
        assertEquals(3, numberOfBooksPublicatedAfter2007);

        /*
        long numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())
           .filter(n -> books.get(n).getYearOfPublication() > 2007)
           .count();
         */

    }
}
