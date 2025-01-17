package com.pembekalan.xsisacademy.service.impl;

import com.pembekalan.xsisacademy.dto.request.BookRequestDto;
import com.pembekalan.xsisacademy.dto.response.AuthorResponseDto;
import com.pembekalan.xsisacademy.dto.response.BookResponseDto;
import com.pembekalan.xsisacademy.entity.Author;
import com.pembekalan.xsisacademy.entity.Book;
import com.pembekalan.xsisacademy.entity.Category;
import com.pembekalan.xsisacademy.entity.Publisher;
import com.pembekalan.xsisacademy.repository.AuthorRepository;
import com.pembekalan.xsisacademy.repository.BookRepository;
import com.pembekalan.xsisacademy.repository.CategoryRepository;
import com.pembekalan.xsisacademy.repository.PublisherRepository;
import com.pembekalan.xsisacademy.service.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    BookRepository bookRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    PublisherRepository publisherRepository;

    @Autowired
    AuthorRepository authorRepository;

    private ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Override
    public List<BookResponseDto> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        List<BookResponseDto> bookResponseDtos = books.stream()
                                                .map(book -> modelMapper()
                                                .map(book, BookResponseDto.class))
                                                .collect(Collectors.toList());
        return bookResponseDtos;
    }

    @Override
    public BookResponseDto getBookById(Integer id) {
        Book book = bookRepository.findById(id).orElse(null);
        BookResponseDto bookResponseDto = modelMapper().map(book, BookResponseDto.class);
        return  bookResponseDto;
    }

    @Override
    public Book saveBook(BookRequestDto bookRequestDto) {
        Category category = categoryRepository.findById((bookRequestDto.getCategory_id())).orElseThrow();
        Publisher publisher = publisherRepository.findById(bookRequestDto.getPublisher_id()).orElseThrow();
        Author author = authorRepository.findById(bookRequestDto.getAuthor_id()).orElseThrow();
        Book book = modelMapper().map(bookRequestDto, Book.class);
        book.setCategory(category);
        book.setPublisher(publisher);
        book.setAuthor(author);
        return  bookRepository.save(book);
    }

    @Override
    public void deleteBookById(Integer id) {
        bookRepository.deleteById(id);
    }
}
