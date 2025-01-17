package com.pembekalan.xsisacademy.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "authors")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Author extends BaseEntity{

    public Author(String name, Integer publishedBooks) {
        this.name = name;
        this.publishedBooks = publishedBooks;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100)
    private String name;

    private Integer publishedBooks;

}
