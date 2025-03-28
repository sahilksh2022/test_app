package com.aptitudetestapi.test_app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Data
public class Topics {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "topic_name", nullable = false)
    private String topic_name;

    @ManyToOne
    @JoinColumn(name = "subject_id",nullable = false)
    private Subjects subject;

    @OneToMany
    @JsonIgnore
    private List<Questions> questions;
}
