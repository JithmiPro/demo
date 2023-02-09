package com.example.demo.DTO;

import com.example.demo.Entity.Customer;
import com.example.demo.Entity.Goods;
import com.example.demo.Entity.qty_compositeKey;
import javax.persistence.EmbeddedId;

public class Picks_Qty_DTO {
    private long pick_id;
    @EmbeddedId
    qty_compositeKey id;
    Customer customer;
    Goods goods;
    int ex_qty ;



}

