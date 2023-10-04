package com.simform.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "book")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;

    @Column(name = "book_name")
    private String bookName;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "book", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("book")
    private List<Story> storyList = new ArrayList<>();
}