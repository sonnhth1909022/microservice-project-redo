package com.microservice.inventoryservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "inventory")
public class Inventory extends BaseEntity{
    @Id
    private long productId;

    private int stockQuantity;

    @Column(name="provider_id")
    private long providerId;

    @ManyToOne
    @JoinColumn(name = "provider_id",insertable = false, updatable = false)
    private Provider provider;
}
