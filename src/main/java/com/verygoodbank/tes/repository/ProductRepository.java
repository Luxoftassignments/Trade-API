package com.verygoodbank.tes.repository;
import com.verygoodbank.tes.entity.Tradeproduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository  extends CrudRepository<Tradeproduct, Long> {



}
