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
public class Product extends AbsEntity {
    private String name;

    private Double price;

    private String  description;

    private Integer allAmount;

    @ManyToOne
    private Attachment attachment;

    @ManyToOne
    private Brand brand;

    @ManyToMany
    private List<Color> colors;

}
