package com.xworkz.rajajinagar.service;

import com.xworkz.rajajinagar.dto.BagDTO;
import com.xworkz.rajajinagar.entity.BagEntity;
import com.xworkz.rajajinagar.repository.BagRepo;
import com.xworkz.rajajinagar.repository.BagRepoimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BagServiceImp implements BagService{
    @Autowired
    BagRepo bagRepo;

    @Override
    public boolean getBag(BagDTO bagDTO) {
        BagRepo bagRepo=new BagRepoimp();
        BagEntity bagEntity=new BagEntity();
        bagEntity.setBagname(bagDTO.getBagname());
        bagEntity.setBagprice(bagDTO.getBagprice());
        bagEntity.setBagcolor(bagDTO.getBagcolor());

        bagRepo.getBag(bagEntity);
        return false;
    }
}
