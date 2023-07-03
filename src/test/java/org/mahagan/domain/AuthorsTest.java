package org.mahagan.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class AuthorsTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Authors}
     *   <li>{@link Authors#setAuthorEducation(String)}
     *   <li>{@link Authors#setAuthorEmail(String)}
     *   <li>{@link Authors#setAuthorId(int)}
     *   <li>{@link Authors#setAuthorName(String)}
     *   <li>{@link Authors#setBooks(Set)}
     *   <li>{@link Authors#getAuthorEducation()}
     *   <li>{@link Authors#getAuthorEmail()}
     *   <li>{@link Authors#getAuthorId()}
     *   <li>{@link Authors#getAuthorName()}
     *   <li>{@link Authors#getBooks()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Authors actualAuthors = new Authors();
        actualAuthors.setAuthorEducation("JaneDoe");
        actualAuthors.setAuthorEmail("jane.doe@example.org");
        actualAuthors.setAuthorId(1);
        actualAuthors.setAuthorName("JaneDoe");
        HashSet<Books> books = new HashSet<>();
        actualAuthors.setBooks(books);
        assertEquals("JaneDoe", actualAuthors.getAuthorEducation());
        assertEquals("jane.doe@example.org", actualAuthors.getAuthorEmail());
        assertEquals(1, actualAuthors.getAuthorId());
        assertEquals("JaneDoe", actualAuthors.getAuthorName());
        assertSame(books, actualAuthors.getBooks());
    }
}

