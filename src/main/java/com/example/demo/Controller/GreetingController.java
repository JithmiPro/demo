package com.example.demo.Controller;


import com.example.demo.Repo.CustomerRepo;
import com.example.demo.Repo.GoodsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {

    @Autowired
    CustomerRepo customerRepo;
    @Autowired
    GoodsRepo goodsRepo;

    @RequestMapping("/NewCust")
    public String getNewCust(Model model) {
        model.addAttribute("Cust_list", customerRepo.findAll());
        return "CustomerRegister";
    }

    @RequestMapping("/NewGoods")
    public String getNewGoods(Model model) {
        model.addAttribute("Goods_list", goodsRepo.findAll());
        return "Add_Goods";
    }

    @RequestMapping("/Picks_Qty")
    public String getPicks(Model model) {
        model.addAttribute("Cust_list", customerRepo.findAll());
        model.addAttribute("Goods_list", goodsRepo.findAll());
        return "Customer_Pick_goods";
    }

}
