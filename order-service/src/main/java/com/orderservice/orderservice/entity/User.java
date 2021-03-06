package com.orderservice.orderservice.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
@ToString
public class User extends BaseEntity{
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2",
            parameters = @org.hibernate.annotations.Parameter(name = "prefix", value = "ORDER")
            , strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "user_id",columnDefinition = "VARCHAR(60)")
    private String userId;

    private String userName;
    private String password;
}
