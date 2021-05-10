package com.kodilla.spring.reader;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ReaderTestSuite {

    @Test
    void testRead() {

        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
        Reader reader = context.getBean(Reader.class);

        reader.read();
    }
    @Test
    void testConditonal() {

        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
        boolean book2Exists = context.containsBean("book2");
        System.out.println("Bean book2 was founf in the container: "+ book2Exists);
    }
}
