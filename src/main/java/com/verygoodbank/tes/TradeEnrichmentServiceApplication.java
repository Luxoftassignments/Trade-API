package com.verygoodbank.tes;

import com.verygoodbank.tes.entity.Tradedatafile;
import com.verygoodbank.tes.entity.Tradeproduct;
import com.verygoodbank.tes.repository.ProductRepository;
import com.verygoodbank.tes.repository.TradedatafileRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.text.SimpleDateFormat;

@SpringBootApplication
public class TradeEnrichmentServiceApplication {

	public static void main(String[] args) 	{

		ConfigurableApplicationContext ctxt = SpringApplication.run(TradeEnrichmentServiceApplication.class, args);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYMMDD");


		// insert the data from JPA repostory in the oracle databse.---Tradedatafiles.
		TradedatafileRepository bean = ctxt.getBean(TradedatafileRepository.class);
		Tradedatafile entiry = new Tradedatafile();
		entiry.setTrade_date("20150101");
		entiry.setProduct_id(4);
		entiry.setCurrency("EUR");
		entiry.setPrice("54.56");
		bean.save(entiry);
		//ctxt.close();


		// insert the data from JPA repostory in the oracle databse.---Trade Products.

		ProductRepository bean1 = ctxt.getBean(ProductRepository.class);
		Tradeproduct entity = new Tradeproduct();
		entity.setProduct_id(4);
		entity.setProduct_name("Interest rate swaps International");
		bean1.save(entity);
		ctxt.close();

	}

}
