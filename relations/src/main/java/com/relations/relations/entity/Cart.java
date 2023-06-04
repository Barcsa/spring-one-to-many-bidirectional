package com.relations.relations.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "cart")
public class Cart {


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long cartId;


        @JsonIgnore
        @OneToMany(mappedBy = "cart")
        private Set<Item> items;

    }


