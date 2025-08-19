package com.xworkz.page.repository;

import com.xworkz.page.entity.SignUpEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public class SignUpRepositoryImp implements SignUpRepository{
    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean getSignUp(SignUpEntity signUpEntity) {
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;
        try{
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(signUpEntity);
            entityTransaction.commit();
        }catch (Exception e){
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }
            e.printStackTrace();
        }finally {
            entityManager.close();
        }
        return false;
    }

//    @Override
//    public boolean getSignIn(String name) {
//        EntityManager entityManager=null;
//        EntityTransaction entityTransaction=null;
//        try{
//            entityManagerFactory= Persistence.createEntityManagerFactory("xworkz");
//            entityManager=entityManagerFactory.createEntityManager();
//            entityTransaction=entityManager.getTransaction();
//            entityTransaction.begin();
//            Query query= entityManager.createNamedQuery("SignIn");
//            query.setParameter("Name",name);
//            entityTransaction.commit();
//        }catch (Exception e){
//            if(entityTransaction.isActive()){
//                entityTransaction.rollback();
//            }
//            e.printStackTrace();
//        }finally {
//            entityManager.close();
//        }
//        return false;
//    }


}
