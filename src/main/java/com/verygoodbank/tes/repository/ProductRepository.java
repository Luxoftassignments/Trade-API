package com.verygoodbank.tes.repository;

import com.verygoodbank.tes.entity.Tradeproduct;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository  extends CrudRepository<Tradeproduct, Long> {

    /* @Query(value = "SELECT * FROM product_inventory WHERE product_name = ?1", nativeQuery = true)
     List<Tradeproduct> getProductsByName(String product_name);
 */



}
