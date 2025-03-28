package com.aptitudetestapi.test_app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Subjects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String subject_name;

    @OneToMany(mappedBy = "subject", cascade = CascadeType.ALL)
    @JsonIgnore // Prevent recursion
    private List<Topics> topics;
}
