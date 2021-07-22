package com.example.SpringProject.boostrap;

import com.example.SpringProject.Repositories.AuthorRepository;
import com.example.SpringProject.Repositories.BookRepository;
import com.example.SpringProject.Repositories.PublisherRepository;
import com.example.SpringProject.domain.Author;
import com.example.SpringProject.domain.Book;
import com.example.SpringProject.domain.Publisher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BooStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BooStrapData(AuthorRepository authorRepository, BookRepository bookRepository,
                        PublisherRepository publisherRepository) {

        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;

    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without", "132132");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        Author tolkie = new Author("JR", "Tolkien");
        Book lotr = new Book("El señor de los anillos", "1423");
        Publisher pinguin = new Publisher("Mexico colonia roma", "Guadalajara",
                "Jalisco",45402);
        tolkie.getBooks().add(lotr);
        lotr.getAuthors().add(tolkie);
        pinguin.

        authorRepository.save(tolkie);
        bookRepository.save(lotr);
        publisherRepository.save(pinguin);

        System.out.println("Started in boostrap");
        System.out.println("Number of books: " + bookRepository.count());
        System.out.println("Number of Publisher: " + publisherRepository.count());


    }
}