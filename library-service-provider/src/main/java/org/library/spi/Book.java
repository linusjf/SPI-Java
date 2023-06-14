package org.library.spi;
/**
 * @author      : Linus Fernandes (linusfernandes at gmail dot com)
 * @file        : Book
 * @created     : Wednesday Jun 14, 2023 11:28:12 IST
 */

public class Book {
    private String name;
    private String author;
    private String description;

    public Book(String name, String author, String description) {
        this.name = name;
        this.author = author;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
