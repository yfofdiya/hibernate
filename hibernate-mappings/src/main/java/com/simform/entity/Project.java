package com.simform.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "projects")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    @Id
    @Column(name = "project_id")
    @GeneratedValue
    private Long projectId;

    private String title;

    @ManyToMany(mappedBy = "projects", cascade = CascadeType.ALL)
    private List<Employee> employees = new ArrayList<>();
}
