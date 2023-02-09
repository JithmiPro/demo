package com.example.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer_DTO {

    private long custId;
    private String c_name;
    private String c_nic;
    private Date c_RegDate;

}
