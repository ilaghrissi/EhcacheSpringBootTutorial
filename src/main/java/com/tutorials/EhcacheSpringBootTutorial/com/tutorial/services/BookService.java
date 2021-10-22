package com.tutorials.EhcacheSpringBootTutorial.com.tutorial.services;

import com.tutorials.EhcacheSpringBootTutorial.com.tutorial.dto.Book;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class BookService {

  private static final Logger logger = LoggerFactory.getLogger(BookService.class);

  @Cacheable(cacheNames = "bookCache",key = "#id")
  public Book getBookById(Long id){
    Book b = new Book();
    b.setId(1L);
    b.setTitle("title");
    b.setAuthor("author");
    return b;
  }
}
