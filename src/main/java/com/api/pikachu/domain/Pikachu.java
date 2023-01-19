package com.api.pikachu.domain;



import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.NotNull;
public class Pikachu {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@NotNull
    private Long id;
    private String name;
    private int age;
    private String URL;
}

