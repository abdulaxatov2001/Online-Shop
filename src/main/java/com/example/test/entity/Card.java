package com.example.test.entity;

import com.example.test.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card extends AbsEntity {
    @ManyToOne
    private Users user;

    @ManyToOne
    private Product products;

    private Integer amount;

    private Double allPrice;






}
