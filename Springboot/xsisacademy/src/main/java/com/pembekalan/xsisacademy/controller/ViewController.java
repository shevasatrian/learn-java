package com.pembekalan.xsisacademy.controller;

import com.pembekalan.xsisacademy.config.ApiEndpoints;
import com.pembekalan.xsisacademy.entity.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class ViewController {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/publisher")
    public String getAllPublishers(Model model) {
        String title = "Publisher Page";
        Map response = restTemplate.getForObject(ApiEndpoints.PUBLISHERS, Map.class);
        model.addAttribute("publishers", response.get("data"));
        model.addAttribute("title", title);
        return "publisher/index"; // templates/publisher/index.html
    }

    @GetMapping("/author")
    public String getAllAuthors(Model model) {
        String title = "Author Page";
        Map response = restTemplate.getForObject(ApiEndpoints.AUTHORS, Map.class);
        model.addAttribute("authors", response.get("data"));
        model.addAttribute("title", title);
        return "author/index"; // templates/publisher/index.html
    }

    @GetMapping("/book")
    public String getAllBooks(Model model) {
        String title = "Book Page";
        Map response = restTemplate.getForObject(ApiEndpoints.BOOKS, Map.class);
        model.addAttribute("books", response.get("data"));
        model.addAttribute("title", title);
        return "book/index"; // templates/publisher/index.html
    }

}
