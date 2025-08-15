package com.xworkz.rajajinagar.repository;

import com.xworkz.rajajinagar.entity.ShopEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class ShopRepositoryImp implements ShopRepository{
    EntityManagerFactory entityManagerFactory=null;
    @Override
    public boolean save(ShopEntity shopEntity) {
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;
        try{
            entityManagerFactory= Persistence.createEntityManagerFactory("rajajinagar");
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(shopEntity);
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
}
