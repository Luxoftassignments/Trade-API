package com.verygoodbank.tes.web.controller;


import com.verygoodbank.tes.entity.Tradedatafile;
import com.verygoodbank.tes.entity.Tradeproduct;
import com.verygoodbank.tes.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class TradeEnrichmentController {

    @Autowired
    private ProductService productService;


    //get all the products in the table in our database.
    @GetMapping("/products")
    public List<Tradeproduct> getProducts() {
        List<Tradeproduct> products = productService.getalltradeproducts();
        return products;
    }

    // get all tradedatafile in the Table from the databse..


    @GetMapping("/tradedatafiles")
    public List<Tradedatafile> getalltradeDataFiles()
    {
        List<Tradedatafile> tradedatafileList = productService.getalltradedatafiles();

        return tradedatafileList;
    }



}


