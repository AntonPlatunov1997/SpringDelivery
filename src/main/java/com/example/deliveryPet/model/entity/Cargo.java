package com.example.deliveryPet.model.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cargo")
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // это стратегия автоинкримент
    private Long id;

    @Column(name = "weight")
    private Integer weight;



    @Column(name = "cost")
    private Long cost;

@ManyToOne
@JoinColumn(name = "id_user", nullable = false)
private User user;


    @ManyToOne
    @JoinColumn(name = "id_city_from", nullable = false)
    private City city;


    @ManyToOne
    @JoinColumn(name = "id_city_to", nullable = false)
    private City cityTo;

    public Cargo() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }


}



