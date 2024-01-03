package com.verygoodbank.tes.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name = "trade_datafile")

public class Tradedatafile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long product_id;

    @Column(name = "trade-date", nullable = false)
    public String trade_date;

    @Column(name = "currency", nullable = false)
    public String currency;

    @Column(name = "price", nullable = false)
    public String price;

}
