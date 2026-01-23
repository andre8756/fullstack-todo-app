package com.todo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_listas")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String description;

    // CheckBox
    @Column
    private boolean completed;

}
