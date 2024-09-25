package com.aluracursos.literalura.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long gutendexId;
    private String title;
    @OneToMany (mappedBy = "book", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Person> authors = new ArrayList<>();
    private String language;
    private Long downloadCount;

    public Book(BookData book) {
        this.gutendexId = book.gutendexId();
        this.title = book.title();
        this.authors = book.authors();
        this.downloadCount = book.downloadCount();
    }

    public List<Person> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Person> authors) {
        this.authors = authors;
    }

    public Long getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Long downloadCount) {
        this.downloadCount = downloadCount;
    }

    public Long getGutendexId() {
        return gutendexId;
    }

    public void setGutendexId(Long gutendexId) {
        this.gutendexId = gutendexId;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                ", title='" + title + '\'' +
                "authors=" + authors +
                ", downloadCount=" + downloadCount +
                '}';
    }
}
