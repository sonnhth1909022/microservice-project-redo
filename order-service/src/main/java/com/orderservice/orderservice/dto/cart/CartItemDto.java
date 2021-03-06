package com.orderservice.orderservice.dto.cart;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CartItemDto {
    private long productId;
    private String productName;
    private int quantity;
    private String thumbnail;
    private double unitPrice;
}
