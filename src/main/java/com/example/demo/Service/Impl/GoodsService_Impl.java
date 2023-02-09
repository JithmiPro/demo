package com.example.demo.Service.Impl;

import com.example.demo.DTO.Customer_DTO;
import com.example.demo.DTO.Goods_DTO;
import com.example.demo.Entity.Customer;
import com.example.demo.Entity.Goods;
import com.example.demo.Repo.CustomerRepo;
import com.example.demo.Repo.GoodsRepo;
import com.example.demo.Service.CustomerService;
import com.example.demo.Service.GoodsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// impl <---> service
//  <-- impl
//      -- to
//          -- controller
//              -->
//  service <-----> controller

@Service
@Transactional
public class GoodsService_Impl implements GoodsService {
    @Autowired
    GoodsRepo goodsRepo;
    @Autowired

    private ModelMapper modelMapper;

    @Override
    public Goods_DTO saveGoods(Goods_DTO  goodsDto) {
        goodsRepo.save(modelMapper.map(goodsDto, Goods.class));
        goodsRepo.findAll();
        return goodsDto;
    }
}
