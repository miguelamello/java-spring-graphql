package com.example.spring;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
//import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller
public class MeterController {
    
  @QueryMapping
  public Meter getMeterById(@Argument String id) {
    return Meter.getById(id);
  }

  @QueryMapping
  public List<Meter> getAllMeters() {
    return Meter.getAll();
  }

  @SchemaMapping
  public Author author(Book book) {
    return Author.getById(book.authorId());
  }
  
}