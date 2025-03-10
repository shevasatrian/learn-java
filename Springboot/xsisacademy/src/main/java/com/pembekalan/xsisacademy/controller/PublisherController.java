package com.pembekalan.xsisacademy.controller;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pembekalan.xsisacademy.dto.request.PublisherRequestDto;
import com.pembekalan.xsisacademy.dto.response.PublisherResponseDto;
import com.pembekalan.xsisacademy.entity.Publisher;
import com.pembekalan.xsisacademy.service.PublisherService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
// @CrossOrigin
@RequestMapping("/api/publisher")
public class PublisherController {

    @Autowired
    PublisherService publisherService;

    @GetMapping("")
    public ResponseEntity<?> getAllPublishers() {
        List<PublisherResponseDto> publisherResponseDtos = publisherService.getAddPublishers();
        LinkedHashMap<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("status", "200");
        resultMap.put("message", "success");
        resultMap.put("data", publisherResponseDtos);
        return new ResponseEntity<>(resultMap, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getPublisherById(@PathVariable Integer id) {
        PublisherResponseDto publisherResponseDto = publisherService.getPublisherById(id);
        LinkedHashMap<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("status", "200");
        resultMap.put("message", "success");
        resultMap.put("data", publisherResponseDto);
        return new ResponseEntity<>(resultMap, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<?> savePublisher(@RequestBody PublisherRequestDto publisherRequestDto) {
        Publisher publisher = publisherService.savePublisher(publisherRequestDto);
        LinkedHashMap<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("status", "200");
        resultMap.put("message", "success");
        resultMap.put("data", publisher);
        return new ResponseEntity<>(resultMap, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updatePublisher(@PathVariable Integer id, 
                                            @RequestBody PublisherRequestDto publisherRequestDto) {
        publisherRequestDto.setId(id);
        publisherService.savePublisher(publisherRequestDto);
        LinkedHashMap<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("status", "200");
        resultMap.put("message", "success");
        resultMap.put("data", publisherRequestDto);
        return new ResponseEntity<>(resultMap, HttpStatus.OK);
    //     Publisher publisher = modelMapper().map(publisherResponseDto, Publisher.class);
    //     modelMapper().map(publisher, PublisherRequestDto.class);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePublisher(@PathVariable Integer id) {
        publisherService.deletePublisherById(id);
        LinkedHashMap<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("status", "200");
        resultMap.put("message", "success");
        return new ResponseEntity<>(resultMap, HttpStatus.OK);
    }
    
    
    
    
}
