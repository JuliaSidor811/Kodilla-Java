package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;


import static org.junit.jupiter.api.Assertions.*;


public class LibraryTestSuite {

    @Test
     void testGetBooks(){
        Library library = new Library("Pierwsza Biblioteka");

        Book b1 = new Book("Tytul 1", "Autor 1", LocalDate.now());
        Book b2 = new Book("Tytul 2", "Autor 2", LocalDate.now());
        Book b3 = new Book("Tytul 3", "Autor 3", LocalDate.now());
        Book b4 = new Book("Tytul 4", "Autor 4", LocalDate.now());

        library.getBooks().add(b1);
        library.getBooks().add(b2);
        library.getBooks().add(b3);
        library.getBooks().add(b4);

        //shallow copy
        Library clonedLibrary = null;
        try{
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Druga Biblioteka");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //deep copy
        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Trzecia Biblioteka");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        library.getBooks().remove(b2);

        assertEquals(3, library.getBooks().size());
        assertEquals(3, clonedLibrary.getBooks().size());
        assertEquals(4,deepClonedLibrary.getBooks().size());



    }

}
