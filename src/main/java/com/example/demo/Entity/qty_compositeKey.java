package com.example.demo.Entity;

import javax.persistence.*;
import java.io.Serializable;

// Composite key
@Embeddable
public class qty_compositeKey implements Serializable {

    @Column(name = "Customer_details", length = 45)
    Long custId;


    @Column(name = "Goods_details", length = 45)
    Long good_Id;
}
