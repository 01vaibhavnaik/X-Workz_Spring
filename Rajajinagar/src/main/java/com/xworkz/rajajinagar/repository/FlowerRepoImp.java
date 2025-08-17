package com.xworkz.rajajinagar.repository;

import com.xworkz.rajajinagar.entity.FlowerEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
@Repository
public class FlowerRepoImp implements FlowerRepo{
    EntityManagerFactory emf=null;
    @Override
    public boolean saveFlower(FlowerEntity flowerEntity) {
        EntityManager em=null;
        EntityTransaction et=null;
        try {
            emf= Persistence.createEntityManagerFactory("rajajinagar");
            em=emf.createEntityManager();
            et=em.getTransaction();

            et.begin();
            em.persist(flowerEntity);
            et.commit();
        }catch (Exception e){
            if(et.isActive()){
                et.rollback();
            }

        }finally {
            em.close();
        }
        return false;
    }
}
