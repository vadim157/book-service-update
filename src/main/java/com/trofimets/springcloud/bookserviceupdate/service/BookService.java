package com.trofimets.springcloud.bookserviceupdate.service;

import com.trofimets.springcloud.bookserviceupdate.model.Book;

import java.util.List;

public interface BookService {

    List<Book> findAllBooks();
}
