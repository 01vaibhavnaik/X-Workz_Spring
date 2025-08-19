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
            assert entityTransaction != null;
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }
            e.printStackTrace();
        }finally {
            entityManager.close();
        }
        return false;
    }

    @Override
    public SignUpEntity getSignIn(String email) {
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;
        SignUpEntity sign = new SignUpEntity();
        System.out.println("Email Repo:"+email);
        System.out.println("============>"+sign);
        try {
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();

            entityTransaction.begin();

            Query query = entityManager.createNamedQuery("signIn");
            query.setParameter("email", email);
           sign = (SignUpEntity) query.getSingleResult();
            System.out.println("---------"+sign);

            entityTransaction.commit();
        } catch (Exception e) {
            if (entityTransaction != null && entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        return sign;
    }


}
