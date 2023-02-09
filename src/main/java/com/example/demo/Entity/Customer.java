package com.example.demo.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cust")
    @SequenceGenerator(name = "seq_cust", allocationSize = 5)
    @Column(name = "Customer_details")
    private long custId;

    @Column(name = "Cust_name")
    private String c_name;
    @Column(name = "Cust_nic")
    private String c_nic;
    private Date c_RegDate;

    @ManyToMany
    @JoinTable(
            name = "likes_goods",
            joinColumns = @JoinColumn(name = "Customer_details"),
            inverseJoinColumns = @JoinColumn(name = "Goods_details"))
    Set<Goods> likes_goods;

}
