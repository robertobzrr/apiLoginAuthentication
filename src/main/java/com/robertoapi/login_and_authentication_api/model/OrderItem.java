package com.robertoapi.login_and_authentication_api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_order_item")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantity;
    private Double price;


    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;


    @ManyToOne
    @JoinColumn(name = "id_order")
    @JsonIgnore
    private Order order;


    public Double getSubTotal(){
        return price.doubleValue()*quantity;
    }



}
