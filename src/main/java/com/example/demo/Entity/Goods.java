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
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_goods")
    @SequenceGenerator(name = "seq_goods", allocationSize = 5)
    @Column(name = "Goods_details")
    private long good_Id;

    @Column(name = "goods_name")
    private String g_name;
    @Column(name = "Goods_code")
    private String g_code;
    private Date g_RegDate;
    private int qty ;

    @ManyToMany
    Set<Customer> likes_customers;



}
