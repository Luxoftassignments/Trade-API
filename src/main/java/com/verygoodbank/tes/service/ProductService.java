package com.verygoodbank.tes.service;

import com.verygoodbank.tes.entity.Tradedatafile;
import com.verygoodbank.tes.entity.Tradeproduct;
import com.verygoodbank.tes.repository.ProductRepository;
import com.verygoodbank.tes.repository.TradedatafileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class ProductService {

    @Autowired
    private final ProductRepository productRepository;

    @Autowired
    private final TradedatafileRepository tradedatafileRepository;


    //  Save the all Products.
    public Tradeproduct savetradeProducts(Tradeproduct tradeproduct)   {

        return productRepository.save(tradeproduct);
    }

    // get all Trade Products.

    public List<Tradeproduct> getalltradeproducts()
    {
        return (List<Tradeproduct>) productRepository.findAll();
    }



    //  Save the all Tradd data file  Products.
    public Tradedatafile savetradedatafile(Tradedatafile tradedatafile)   {

        return tradedatafileRepository.save(tradedatafile);
    }

    // get all Tradedatafile  Products.

    public List<Tradedatafile> getalltradedatafiles()
    {
        return (List<Tradedatafile>) tradedatafileRepository.findAll();
    }

    public List<Tradedatafile> getalltradedatafile() {
        return (List<Tradedatafile>) tradedatafileRepository.findAll();
    }

}
