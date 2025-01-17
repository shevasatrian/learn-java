package com.pembekalan.xsisacademy.repository;

import com.pembekalan.xsisacademy.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
