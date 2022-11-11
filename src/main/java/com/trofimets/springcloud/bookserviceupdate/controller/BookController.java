package com.trofimets.springcloud.bookserviceupdate.controller;

import com.trofimets.springcloud.bookserviceupdate.model.Book;
import com.trofimets.springcloud.bookserviceupdate.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/")
public class BookController {

    private Logger logger = Logger.getLogger(BookController.class.getName());
    private Environment env;
    private BookService bookService;

    @Autowired
    public BookController(Environment env, BookService bookService) {
        this.env = env;
        this.bookService = bookService;
    }

    @RequestMapping("/")
    public String home() {
        String home = "Book-Service-Update running at port: " + env.getProperty("local.server.port");
        logger.info(home);
        return home;
    }

    @GetMapping("/show")
    public List<Book> getAllBooksList() {
        logger.info("Get data from database (Feign Client on client-service side)");
        return bookService.findAllBooks();
    }

    @GetMapping("/data")
    public List<Book> data() {
        logger.info("Get data from database (RestTemplate on client-service side)");
        return bookService.findAllBooks();
    }


}
