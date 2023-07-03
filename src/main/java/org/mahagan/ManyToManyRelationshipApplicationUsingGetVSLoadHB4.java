package org.mahagan;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.mahagan.domain.Authors;
import org.mahagan.domain.Books;

public class ManyToManyRelationshipApplicationUsingGetVSLoadHB4 {
    public static void main(String[] args) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = metadata.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction tsx = session.beginTransaction();

        //used for data inserte
        /*Authors authors = new Authors();
        authors.setAuthorName("VijayKumar");
        authors.setAuthorEmail("vijay@gmail.com");
        authors.setAuthorEducation("BE");

        Books books = new Books();
        books.setBookName("Java");
        books.setBookPublisher("Oracle");
        books.setBookEdition("JDK 23");

        authors.getBooks().add(books);
        books.getAuthors().add(authors);*/

        //used for data fetch
        Authors authors1 = (Authors)session.get(Authors.class,1);
        Books books1 = (Books)session.get(Books.class,1);
        System.out.println("*********************************************************");

        System.out.println("Data Has been fetched from Database ");
        System.out.println(authors1.getAuthorName()+ " "+authors1.getAuthorEmail()+" "+authors1.getAuthorEducation());
        System.out.println(books1.getBookName()+" "+books1.getBookPublisher()+" "+books1.getBookEdition());
        System.out.println("data Fetched successfully Ok!");

        System.out.println("*********************************************************");

        session.persist(authors1);
        tsx.commit();
        session.close();
        //System.out.println("data Inserted successfully Ok!");

    }
}