package com.orderservice.orderservice.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
@ToString
public class Order extends BaseEntity{
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2",
            parameters = @org.hibernate.annotations.Parameter(name = "prefix", value = "ORDER")
            , strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "order_id",columnDefinition = "VARCHAR(60)")
    private String orderId;

    private String userId;
    private double totalPrice;
    private String address;
    private String name;
    private String phone;
    private String email;
    private String paymentStatus;
    private String inventoryStatus;
    private String orderStatus;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private Set<OrderDetail> orderDetails;
}
