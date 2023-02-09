package com.example.demo.Controller;


import com.example.demo.DTO.Customer_DTO;
import com.example.demo.DTO.Goods_DTO;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller("/api/v1/Goods")
public class GoodsController {


    @PostMapping(value = "/saveGoods", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = MediaType.ALL_VALUE)
    public String saveGoods(HttpServletRequest request, HttpSession seession, @ModelAttribute Goods_DTO dto) {

        return  "redirect:/SuccessPage" ;
    }

}
