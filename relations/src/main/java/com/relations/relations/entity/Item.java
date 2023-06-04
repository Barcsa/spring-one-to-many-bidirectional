package com.relations.relations.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ITEMS")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long itemId;

    @ManyToOne
    @JoinColumn(name="cart_id", nullable = false)
    private Cart cart;
}
