package com.example.ecommeceapi.repository;

import com.example.ecommeceapi.model.article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<article, Integer> {
    article findByNomArticle(String nomArticle);
}
