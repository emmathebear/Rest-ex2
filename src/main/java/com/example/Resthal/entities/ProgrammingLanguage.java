package com.example.Resthal.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgrammingLanguage {
    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)
    private String name;
    private int firstAppearance;
    @Column(nullable = false)
    private String inventor;

}
