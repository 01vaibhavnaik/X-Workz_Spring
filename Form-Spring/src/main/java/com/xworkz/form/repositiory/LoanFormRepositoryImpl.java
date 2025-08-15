package com.xworkz.form.repositiory;

import com.xworkz.form.entity.LoanFormEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class LoanFormRepositoryImpl implements LoanFormRepository {
    EntityManagerFactory eMF = null;

    @Override
    public boolean save(LoanFormEntity loanFormEntity) {
        System.out.println("Running In Repository...");
        System.out.println("LoanType :" + loanFormEntity.getLoantype() + "  Full Name :" + loanFormEntity.getName() + "  Age :" + loanFormEntity.getAge() + "  Email :" + loanFormEntity.getEmail() + "  Address :" + loanFormEntity.getAddress() + "  Monthly Income :" + loanFormEntity.getIncome() + "  Amount Req :" + loanFormEntity.getAmount() + "  Period Of Time :" + loanFormEntity.getRepayment());
        EntityManager eM = null;
        EntityTransaction eT = null;
        try {

            eMF = Persistence.createEntityManagerFactory("loanform");
            eM = eMF.createEntityManager();
            eT = eM.getTransaction();

            eT.begin();
            eM.persist(loanFormEntity);
            eT.commit();

        } catch (Exception e) {
            if (eT.isActive()) {
                eT.rollback();
            }
            e.printStackTrace();
        } finally {
            eM.close();
        }
        return false;
    }

    @Override
    public List<LoanFormEntity> getAll() {

        EntityManager eM = null;
        EntityTransaction eT = null;
        List<LoanFormEntity> list = null;

        try {

            eMF = Persistence.createEntityManagerFactory("loanform");
            eM = eMF.createEntityManager();
            eT = eM.getTransaction();

            eT.begin();
            Query query = eM.createNamedQuery("GetAllLoanDetail");
            list = query.getResultList();
            eT.commit();

        } catch (Exception e) {
            if (eT.isActive()) {
                eT.rollback();
            }
            e.printStackTrace();
        } finally {
            eM.close();
        }
        return list;
    }

    @Override
    public boolean deleteById(int id) {
            EntityManagerFactory eMF=null;
            EntityManager eM = null;
            EntityTransaction eT = null;
            try {

                eMF = Persistence.createEntityManagerFactory("loanform");
                eM = eMF.createEntityManager();
                eT = eM.getTransaction();

                eT.begin();
                LoanFormEntity loanFormEntity=eM.find(LoanFormEntity.class,id);
                eM.remove(loanFormEntity);
                eT.commit();

            } catch (Exception e) {
                if (eT.isActive()) {
                    eT.rollback();
                }
                e.printStackTrace();
            } finally {
                eM.close();
            }
        return false;
    }

    @Override
    public boolean updateAddressById(int id,String address) {
        EntityManagerFactory eMF=null;
        EntityManager eM = null;
        EntityTransaction eT = null;
        try {

            eMF = Persistence.createEntityManagerFactory("loanform");
            eM = eMF.createEntityManager();
            eT = eM.getTransaction();

            eT.begin();
            Query query= eM.createNamedQuery("UpdateAddressByID");
            query.setParameter("Id",id);
            query.setParameter("Address",address);
            query.executeUpdate();
            eT.commit();

        } catch (Exception e) {
            if (eT.isActive()) {
                eT.rollback();
            }
            e.printStackTrace();
        } finally {
            eM.close();
        }
        return false;
    }

    @Override
    public boolean updateAAEByName(String name, int age, String address, String email) {
        EntityManagerFactory eMF=null;
        EntityManager eM = null;
        EntityTransaction eT = null;
        try {

            eMF = Persistence.createEntityManagerFactory("loanform");
            eM = eMF.createEntityManager();
            eT = eM.getTransaction();

            eT.begin();
            Query query=eM.createNamedQuery("UpdateByName");
            query.setParameter("Name",name);
            query.setParameter("Age",age);
            query.setParameter("Address",address);
            query.setParameter("Email",email);
            query.executeUpdate();
            eT.commit();

        } catch (Exception e) {
            if (eT.isActive()) {
                eT.rollback();
            }
            e.printStackTrace();
        } finally {
            eM.close();
        }
        return false;
    }

    @Override
    public List<LoanFormEntity> getAgeBetLoanDetails() {
        EntityManager eM = null;
        EntityTransaction eT = null;
        List<LoanFormEntity> list = null;

        try {

            eMF = Persistence.createEntityManagerFactory("loanform");
            eM = eMF.createEntityManager();
            eT = eM.getTransaction();

            eT.begin();
            Query query= eM.createNamedQuery("GetDetailByAge");
            list=query.getResultList();
            eT.commit();

        } catch (Exception e) {
            if (eT.isActive()) {
                eT.rollback();
            }
            e.printStackTrace();
        } finally {
            eM.close();
        }
        return list;
    }

    @Override
    public LoanFormEntity getEmailAddressByName(String name) {
        EntityManager eM = null;
        EntityTransaction eT = null;
        LoanFormEntity loanFormEntity = null;

        try {

            eMF = Persistence.createEntityManagerFactory("loanform");
            eM = eMF.createEntityManager();
            eT = eM.getTransaction();

            eT.begin();
            Query query= eM.createNamedQuery("getEmailAddressByName");
            query.setParameter("Name",name);
            loanFormEntity=(LoanFormEntity) query.getSingleResult();
            eT.commit();

        } catch (Exception e) {
            if (eT.isActive()) {
                eT.rollback();
            }
            e.printStackTrace();
        } finally {
            eM.close();
        }
        return loanFormEntity;
    }
}


