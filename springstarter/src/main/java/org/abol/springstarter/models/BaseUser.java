package org.abol.springstarter.models;

import lombok.Data;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "base_user")
public class BaseUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String email;
    private String tel;
    private String password;
    private String refer;
    private String contact;
    private boolean terms;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CartItem> cart = new ArrayList<>();
}
