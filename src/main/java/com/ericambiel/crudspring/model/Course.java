package com.ericambiel.crudspring.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Course {

    @Id // Primary Key
    @GeneratedValue(strategy = GenerationType.AUTO) //Auto generated key
    private Long id;

    @Column(length = 200, nullable = false)
    private String name;

    @Column(length = 10, nullable = false)
    private String category;
}
