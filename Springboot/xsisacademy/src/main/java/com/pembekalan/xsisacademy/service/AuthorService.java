package com.pembekalan.xsisacademy.service;

import com.pembekalan.xsisacademy.dto.request.AuthorRequestDto;
import com.pembekalan.xsisacademy.dto.response.AuthorResponseDto;
import com.pembekalan.xsisacademy.entity.Author;

import java.util.List;

public interface AuthorService {
    List<AuthorResponseDto> getAllAuthors();
    AuthorResponseDto getAuthorById(Integer id);
    Author saveAuthor(AuthorRequestDto authorRequestDto);
    void deleteAuthorById(Integer id);

}
