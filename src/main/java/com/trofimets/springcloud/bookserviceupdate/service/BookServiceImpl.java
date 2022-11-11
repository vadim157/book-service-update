package com.trofimets.springcloud.bookserviceupdate.service;

import com.trofimets.springcloud.bookserviceupdate.model.Book;
import com.trofimets.springcloud.bookserviceupdate.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


@Service
@Transactional(readOnly = true)
public class BookServiceImpl implements BookService {
    private Logger logger = Logger.getLogger(BookServiceImpl.class.getName());

    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findAllBooks() {
        logger.log(Level.INFO,"Backup method called");
        return bookRepository.findAll();
    }
}
