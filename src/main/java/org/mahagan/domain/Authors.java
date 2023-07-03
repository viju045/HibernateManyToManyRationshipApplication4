/**
 * Created By VijayKumar Moohite
 * Date : 7/3/2023
 * Time : 4:07 PM
 * Project : ManyToManyRelationshipApplicationUsingGetVSLoadHB4
 **/

package org.mahagan.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
//This is my fourth ManyToMany mapping relationship application.
@Entity
@Table(name = "author")
public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int authorId;
    private String authorName;
    private String authorEmail;
    private String authorEducation;
    @ManyToMany(cascade = CascadeType.ALL)
            @JoinTable(name= "authors_books",joinColumns = {@JoinColumn(name="authorId")},
                    inverseJoinColumns = {@JoinColumn(name = "id")})
    Set<Books>books =new HashSet<>();

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public String getAuthorEducation() {
        return authorEducation;
    }

    public void setAuthorEducation(String authorEducation) {
        this.authorEducation = authorEducation;
    }

    public Set<Books> getBooks() {
        return books;
    }

    public void setBooks(Set<Books> books) {
        this.books = books;
    }
}
