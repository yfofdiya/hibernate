package com.simform.hibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Cacheable
@Cache(usage= CacheConcurrencyStrategy.READ_ONLY)
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String city;
}
