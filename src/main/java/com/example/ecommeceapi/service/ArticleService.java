package com.example.ecommeceapi.service;

import com.example.ecommeceapi.model.article;
import com.example.ecommeceapi.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository repository;

    public article saveArticle(article article) {
        return repository.save(article);
    }

    public List<article> saveArticles(List<article> articles) {
        return repository.saveAll(articles);
    }

    public List<article> getArticles() {
        return repository.findAll();
    }

    public article getArticleById(int id) {
        return repository.findById(id).orElse(null);
    }

    public article getArticleByNom(String nomArticle) {
        return repository.findByNomArticle(nomArticle);
    }

    public String deleteArticle(int id) {
        repository.deleteById(id);
        return "Article supprimer avec succés " + id;
    }

    public article updateArticle(article article) {
        article existingArticle = repository.findById(article.getIdArticle()).orElse(null);
        existingArticle.setNomArticle(article.getNomArticle());
        existingArticle.setDescriptionArticle(article.getDescriptionArticle());
        existingArticle.setPrixArticle(article.getPrixArticle());
        existingArticle.setStockArticle(article.getStockArticle());
        return repository.save(existingArticle);
    }
}
