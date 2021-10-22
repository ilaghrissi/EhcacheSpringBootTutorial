package com.tutorials.EhcacheSpringBootTutorial.com.tutorial.controllers;

import com.tutorials.EhcacheSpringBootTutorial.com.tutorial.services.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/book",produces = MediaType.APPLICATION_JSON_VALUE)
public class BookController {

  private static final Logger logger = LoggerFactory.getLogger(BookController.class);
  @Autowired
  private BookService bookService;

  @GetMapping(path = "/book/{id}")
  public String getBook(@PathVariable Long id) {
    logger.info("call bookService to get book {}", id);
    return String.format("{\"book\": %s}", bookService.getBookById(id).getTitle());
  }
}