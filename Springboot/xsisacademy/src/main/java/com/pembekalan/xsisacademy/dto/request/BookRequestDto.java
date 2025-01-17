package com.pembekalan.xsisacademy.dto.request;

import lombok.Data;

import java.util.Date;

@Data
public class BookRequestDto {

    private Integer id;
    private Integer category_id;
    private Integer publisher_id;
    private Integer author_id;
    private String title;
    private String synopsis;
    private Integer stock;
    private Date publishedAt;

}
