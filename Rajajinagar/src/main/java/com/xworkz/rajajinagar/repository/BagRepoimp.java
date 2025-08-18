package com.xworkz.rajajinagar.repository;

import com.xworkz.rajajinagar.entity.BagEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
@Repository
public class BagRepoimp implements BagRepo{
    EntityManagerFactory entityManagerFactory=null;
    @Override
    public boolean getBag(BagEntity bagEntity) {
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;
        try{
            entityManagerFactory= Persistence.createEntityManagerFactory("rajajinagar");
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();

            entityTransaction.begin();
            entityManager.persist(bagEntity);
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
