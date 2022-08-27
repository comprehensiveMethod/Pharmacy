package com.hospital.pharmacy.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="medicines")
@Getter
@Setter
public class Medicine {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name", unique = true, length = 50)
    private String name;
    @Column(name = "description",length = 1000)
    private String description;
    @Column(name = "effects", length = 400)
    private String effects;
}
