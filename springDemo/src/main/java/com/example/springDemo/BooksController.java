package com.example.springDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController
{
    @GetMapping("/books")
        public List<Book> getAllBooks() {
        return Arrays.asList(
                new Book(1l, "Maths", "Gunjan"),
                new Book(2l, "English", "Aadi"),
                new Book(3l, "Hindi", "Aanya")
        );
    }

}
