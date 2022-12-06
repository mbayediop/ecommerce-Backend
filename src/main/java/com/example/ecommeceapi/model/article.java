package com.example.ecommeceapi.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "article")
public class article {
    @Id
    @GeneratedValue
    private int idArticle;
    private String nomArticle;
    private String descriptionArticle;
    private String imageArticle;
    private double prixArticle;
    private double oldPrixArticle;
    private int stockArticle;
    private Instant dateCreationArticle;

}

