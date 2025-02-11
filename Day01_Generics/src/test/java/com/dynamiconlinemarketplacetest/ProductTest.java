package com.dynamiconlinemarketplacetest;

import com.dynamiconlinemarketplace.Book;
import com.dynamiconlinemarketplace.BookCategory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    @Test
    public void testConstructor() {
        Book book = new Book("Java", 255.0, BookCategory.EDUCATIONAL);

        assertEquals("Java", book.getName(), "Constructor should initialize the attribute");

        assertEquals(255.0, book.getPrice(), "Constructor should initializ3 the attribute");

        assertEquals("Educational", book.getCategory(), "Constructor should initialize the attribute");
    }

    @Test
    public void testSetPrice() {
        Book book = new Book("Java", 255.0, BookCategory.EDUCATIONAL);

        book.setPrice(350.0);

        assertEquals(350.0, book.getPrice(), "Price should be update");
    }
}
