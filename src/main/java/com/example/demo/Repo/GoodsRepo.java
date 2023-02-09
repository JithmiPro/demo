package com.example.demo.Repo;

import com.example.demo.Entity.Customer;
import com.example.demo.Entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsRepo extends JpaRepository<Goods, Long> {

}
