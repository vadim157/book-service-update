package com.trofimets.springcloud.bookserviceupdate.init;

import com.trofimets.springcloud.bookserviceupdate.model.Book;
import com.trofimets.springcloud.bookserviceupdate.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@RequiredArgsConstructor
@Component
@Profile("dev")
public class ApplicationRunnerImpl implements ApplicationRunner {

    private BookRepository bookRepository;
    private Logger logger = Logger.getLogger(ApplicationRunnerImpl.class.getName());

    @Autowired
    public ApplicationRunnerImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        bookRepository.deleteAll();
        bookRepository.save(new Book("1", "Java", "OOP", "http://infopulse-univer.com.ua/images/trenings/java.png"));
        bookRepository.save(new Book("2", "Java", "Steram API", "https://www.hdwallpaperslife.com/wp-content/uploads/2018/09/JAVA14-480x270.png"));
        bookRepository.save(new Book("3", "Java", "Collections", "https://i.ytimg.com/vi/oOOESCvGGcI/hqdefault.jpg"));
        bookRepository.save(new Book("4", ".NET", "Basic", "https://upload.wikimedia.org/wikipedia/commons/0/0e/Microsoft_.NET_logo.png"));
        bookRepository.save(new Book("5", "C++", "Basic", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSmgIz9Ug-MVzBQJMcgXedOXTqHWGmbSu5pPDivz8hrfo_GE0HZEA"));
        bookRepository.save(new Book("6", "JavaScript", "Angular 8", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTg41zepuyHbew8bIsTYeKWJ9RYOnnV922lNa85-fQTVrKDG19K2w"));
    }
}
