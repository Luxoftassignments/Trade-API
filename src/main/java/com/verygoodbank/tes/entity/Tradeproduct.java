package com.verygoodbank.tes.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "trade_product")

public class git Tradeproduct {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long product_id;

    @Column(name = "product_name", nullable = false)
    private String product_name;

}
