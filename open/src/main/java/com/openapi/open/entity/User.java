package com.openapi.open.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder //Cliente sea instanciable
@AllArgsConstructor//Constructor con todos los parametros
@NoArgsConstructor  //Constructor vacio por defecto
@Entity
@Table(name="cliente")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String lastname;
    private String contact;
}
