package com.xworkz.form.repositiory;

import com.xworkz.form.entity.LoanFormEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public class LoanFormRepositoryImpl implements LoanFormRepository{
    EntityManagerFactory eMF=null;
    @Override
    public boolean save(LoanFormEntity loanFormEntity) {
        System.out.println("Running In Repository...");
        System.out.println("LoanType :"+loanFormEntity.getLoantype()+"  Full Name :"+loanFormEntity.getName()+"  Age :"+loanFormEntity.getAge()+"  Email :"+loanFormEntity.getEmail()+"  Address :"+loanFormEntity.getAddress()+"  Monthly Income :"+loanFormEntity.getIncome()+"  Amount Req :"+loanFormEntity.getAmount()+"  Period Of Time :"+loanFormEntity.getRepayment());
        EntityManager eM=null;
        EntityTransaction eT=null;
        try {

              eMF= Persistence.createEntityManagerFactory("loanform");
              eM=eMF.createEntityManager();
              eT=eM.getTransaction();

              eT.begin();
              eM.persist(loanFormEntity);
              eT.commit();

        }catch (Exception e){
            if(eT.isActive()){
                eT.rollback();
            }
            e.printStackTrace();
        }finally {
            eM.close();
        }
        return false;
    }
}
