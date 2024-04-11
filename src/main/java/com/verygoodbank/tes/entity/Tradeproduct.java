package com.verygoodbank.tes.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import jakarta.persistence.*;

@Entity
@Data
@Table(name = "trade_product")


public class Tradeproduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long product_id;

    @Column(name = "product_name", nullable = false)
    private String product_name;

}
