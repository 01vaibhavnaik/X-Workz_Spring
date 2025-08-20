package com.xworkz.book.service;

import com.xworkz.book.dto.BookDTO;
import com.xworkz.book.entity.BookEntity;
import com.xworkz.book.repository.Bookrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImp implements BookService{
@Autowired
    Bookrepo bookrepo;

BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
    @Override
    public boolean save(BookDTO bookDTO) {
        BookEntity bookEntity=new BookEntity();
        bookEntity.setBookname(bookDTO.getBookname());
        bookEntity.setBookprice(bookDTO.getBookprice());
        bookEntity.setEmail(bookDTO.getEmail());
        String enc=bCryptPasswordEncoder.encode(bookDTO.getPassword());
        bookEntity.setPassword(enc);

        bookrepo.save(bookEntity);
        return false;
    }
}
