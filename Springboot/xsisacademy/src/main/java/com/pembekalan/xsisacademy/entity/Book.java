package com.pembekalan.xsisacademy.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Book extends  BaseEntity {

    public Book(Category category, Publisher publisher, Author author, String title, String synopsis, Integer stock, Date publishedAt) {
        this.category = category;
        this.publisher = publisher;
        this.author = author;
        this.title = title;
        this.synopsis = synopsis;
        this.stock = stock;
        this.publishedAt = publishedAt;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private Author author;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "publisher_id", referencedColumnName = "id")
    private Publisher publisher;

    @Column(length = 100)
    private String title;

    private String synopsis;

    private Integer stock;

    private Date publishedAt;

}
