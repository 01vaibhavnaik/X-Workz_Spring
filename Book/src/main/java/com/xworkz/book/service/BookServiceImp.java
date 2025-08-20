package com.xworkz.book.service;

import com.xworkz.book.dto.BookDTO;
import com.xworkz.book.entity.BookEntity;
import com.xworkz.book.repository.Bookrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

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
        setEmail(bookDTO.getEmail());
        bookEntity.setEmail(bookDTO.getEmail());
        String enc=bCryptPasswordEncoder.encode(bookDTO.getPassword());
        bookEntity.setPassword(enc);

        bookrepo.save(bookEntity);
        return false;
    }

    public  void setEmail(String email){
        final String username = "vaibhavnaik32275@gmail.com";
        final String password = "ndof jelk psyn wnvx";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(email)
            );
            message.setSubject("Successfully Register");
            message.setText("Thank You..");

            Transport.send(message);

            System.out.println("Done");

        } catch (Exception e) {
            e.printStackTrace();
        }


}
}
