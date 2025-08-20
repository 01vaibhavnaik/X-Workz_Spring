package com.xworkz.book.repository;

import com.xworkz.book.entity.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

@Repository
public class BookrepoImp implements Bookrepo{
    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean save(BookEntity bookEntity) {
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;
        try{
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(bookEntity);
            entityTransaction.commit();
        }catch (Exception e){
            if (entityTransaction.isActive()){
                entityTransaction.rollback();
            }
        }finally {
            entityManager.close();
        }
        return false;
    }
}
