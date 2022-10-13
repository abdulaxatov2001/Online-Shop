package com.example.test.entity;

import com.example.test.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order extends AbsEntity {
    @ManyToOne
    private Users user;
    @ManyToOne
    private Card card;

    private Double allSum;






}
