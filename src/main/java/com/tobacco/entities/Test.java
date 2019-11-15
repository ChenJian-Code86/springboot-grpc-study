package com.tobacco.entities;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="test")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;

    @Column( nullable = true)
    private String name;

    @Column( nullable = true)
    private String test;


}
