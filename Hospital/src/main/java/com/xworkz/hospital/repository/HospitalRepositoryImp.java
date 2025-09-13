package com.xworkz.hospital.repository;

import com.xworkz.hospital.entity.DoctorEntity;
import com.xworkz.hospital.entity.HospitalEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

@Repository
@Slf4j
public class HospitalRepositoryImp implements HospitalRepository {

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public long getDetail(String email) {
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        long count = 0;
        try {
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            Query query = entityManager.createNamedQuery("Counts");
            query.setParameter("email", email);
            count = (long) query.getSingleResult();
            entityTransaction.commit();
            return count;
        } catch (Exception e) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
        } finally {
            entityManager.close();
        }
        return count;
    }

    @Override
    public void saveDetails(DoctorEntity doctorEntity) {
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        try {
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(doctorEntity);
            entityTransaction.commit();

        } catch (Exception e) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
        } finally {
            entityManager.close();
        }
    }

    @Override
    public List<DoctorEntity> viewDetail() {

        EntityManager entityManager = null;
        EntityTransaction entityTransaction=null;
        List<DoctorEntity> list = null;
        try {
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            Query query = entityManager.createNamedQuery("viewdetail");
            list = query.getResultList();

        }catch (Exception e){
            if (entityTransaction.isActive()){
                entityTransaction.rollback();
            }
            e.printStackTrace();
        }finally {
            entityManager.close();
        }

        return list;
    }

    @Override
    public void saveotp(HospitalEntity entity) {
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;
        HospitalEntity hospital=null;
        try{
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.merge(entity);
            System.out.println("Hiiii repo"+hospital);
            entityTransaction.commit();
        }catch (Exception e){
            if (entityTransaction.isActive()){
                entityTransaction.rollback();
            }
            e.printStackTrace();
        }finally {
            entityManager.close();
        }
    }

}
