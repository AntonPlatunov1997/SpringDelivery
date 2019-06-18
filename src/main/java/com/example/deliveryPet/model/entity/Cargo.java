package com.example.deliveryPet.model.entity;


import javax.persistence.*;

@Entity
@Table(name = "cargo")
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "weight")
    private Integer weight;


    @Column(name = "cost")
    private Long cost;


     @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "id_user")
      private User user;

}
