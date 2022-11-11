package com.trofimets.springcloud.bookserviceupdate.repository;

import com.trofimets.springcloud.bookserviceupdate.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book,String> {
}
