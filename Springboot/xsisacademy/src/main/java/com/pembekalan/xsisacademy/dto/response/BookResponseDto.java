package com.pembekalan.xsisacademy.dto.response;

import com.pembekalan.xsisacademy.entity.Author;
import com.pembekalan.xsisacademy.entity.Category;
import com.pembekalan.xsisacademy.entity.Publisher;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class BookResponseDto {

    private Integer id;
    private Category category;
    private Publisher publisher;
    private Author author;
    private String title;
    private String synopsis;
    private Integer stock;
    private Date publishedAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean isDeleted;

}
