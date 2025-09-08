package com.xworkz.hospital.repository;

import com.xworkz.hospital.entity.HospitalEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

@Repository
@Slf4j
public class HospitalRepositoryImp implements HospitalRepository{

@Autowired
    EntityManagerFactory entityManagerFactory;
    @Override
    public long getDetail(String email) {
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;
        long count =0;
        try {
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            Query query= entityManager.createNamedQuery("Counts");
            query.setParameter("email",email);
            count =(long) query.getSingleResult();
            entityTransaction.commit();
            return count;
        }catch (Exception e){
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }
        }finally {
            entityManager.close();
        }
        return count;
    }


}
