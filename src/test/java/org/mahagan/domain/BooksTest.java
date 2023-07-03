package org.mahagan.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class BooksTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Books}
     *   <li>{@link Books#setAuthors(Set)}
     *   <li>{@link Books#setBookEdition(String)}
     *   <li>{@link Books#setBookName(String)}
     *   <li>{@link Books#setBookPublisher(String)}
     *   <li>{@link Books#setId(int)}
     *   <li>{@link Books#getAuthors()}
     *   <li>{@link Books#getBookEdition()}
     *   <li>{@link Books#getBookName()}
     *   <li>{@link Books#getBookPublisher()}
     *   <li>{@link Books#getId()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Books actualBooks = new Books();
        HashSet<Authors> authors = new HashSet<>();
        actualBooks.setAuthors(authors);
        actualBooks.setBookEdition("Book Edition");
        actualBooks.setBookName("Book Name");
        actualBooks.setBookPublisher("Book Publisher");
        actualBooks.setId(1);
        assertSame(authors, actualBooks.getAuthors());
        assertEquals("Book Edition", actualBooks.getBookEdition());
        assertEquals("Book Name", actualBooks.getBookName());
        assertEquals("Book Publisher", actualBooks.getBookPublisher());
        assertEquals(1, actualBooks.getId());
    }
}

