package com.xworkz.rajajinagar.service;

import com.xworkz.rajajinagar.dto.FlowerDTO;
import com.xworkz.rajajinagar.entity.FlowerEntity;
import com.xworkz.rajajinagar.repository.FlowerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlowerServiceImp implements FlowerService{
    @Autowired
    private FlowerRepo flowerRepo;
    @Override
    public boolean saveFlower(FlowerDTO flowerDTO) {
        FlowerEntity flowerEntity=new FlowerEntity();
        flowerEntity.setFlowername(flowerDTO.getFlowername());
        flowerEntity.setFlowerprice(flowerEntity.getFlowerprice());
        flowerEntity.setFlowercolor(flowerDTO.getFlowercolor());

        flowerRepo.saveFlower(flowerEntity);
        return false;
    }
}
