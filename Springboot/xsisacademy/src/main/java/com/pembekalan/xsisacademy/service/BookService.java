package com.pembekalan.xsisacademy.service;

import com.pembekalan.xsisacademy.dto.request.BookRequestDto;
import com.pembekalan.xsisacademy.dto.response.BookResponseDto;
import com.pembekalan.xsisacademy.entity.Book;

import java.util.List;

public interface BookService {
    List<BookResponseDto> getAllBooks();
    BookResponseDto getBookById(Integer id);
    Book saveBook(BookRequestDto bookRequestDto);
    void deleteBookById(Integer id);
}
