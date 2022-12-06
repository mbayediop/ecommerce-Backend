package com.example.ecommeceapi.controller;

import com.example.ecommeceapi.model.article;
import com.example.ecommeceapi.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService service;

    @PostMapping("/addarticle")
    public article addArticle(@RequestBody article article) {
        return service.saveArticle(article);
    }

    @PostMapping("/addarticles")
    public List<article> addArticles(@RequestBody List<article> articles) {
        return service.saveArticles(articles);
    }

    @GetMapping("/articles")
    public List<article> findAllArticles() {
        return service.getArticles();
    }

    @GetMapping("/article/{id}")
    public article findArticleById(@PathVariable int id) {
        return service.getArticleById(id);
    }

    @GetMapping("/article/{nomArticle}")
    public article findArticleByNom(@PathVariable String nomArticle) {
        return service.getArticleByNom(nomArticle);
    }

    @PutMapping("/update-article")
    public article updateArticle(article article) {
        return service.updateArticle(article);
    }

    @DeleteMapping("/delete-article/{id}")
    public String deleteArticle(@PathVariable int id) {
        return service.deleteArticle(id);
    }


}
