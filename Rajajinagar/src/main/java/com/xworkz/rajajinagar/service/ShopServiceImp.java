package com.xworkz.rajajinagar.service;

import com.xworkz.rajajinagar.dto.ShopDTO;
import com.xworkz.rajajinagar.entity.ShopEntity;
import com.xworkz.rajajinagar.repository.ShopRepository;
import com.xworkz.rajajinagar.repository.ShopRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopServiceImp implements ShopService{
    @Autowired
    private ShopRepository shopRepository;
    @Override
    public boolean save(ShopDTO shopDTO) {
        ShopEntity shopEntity=new ShopEntity();
        shopEntity.setShopname(shopDTO.getShopname());
        shopEntity.setShoploc(shopDTO.getShoploc());
        shopEntity.setShopemail(shopDTO.getShopemail());
        shopEntity.setShophno(shopDTO.getShophno());
        shopEntity.setOpeningtime(shopDTO.getOpeningtime());
        shopEntity.setClosingtime(shopDTO.getClosingtime());

        shopRepository.save(shopEntity);

        return false;

    }
}
