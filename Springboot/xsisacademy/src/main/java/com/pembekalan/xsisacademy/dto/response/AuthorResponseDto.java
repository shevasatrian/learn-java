package com.pembekalan.xsisacademy.dto.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AuthorResponseDto {

    private Integer id;
    private String name;
    private Integer publishedBooks;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean isDeleted;

}
