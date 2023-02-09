package com.example.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Goods_DTO {

    private long custId;

    private String g_name;
    private String g_code;
    private Date g_RegDate;

    private int qty ;
}
