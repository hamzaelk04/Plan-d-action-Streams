package model;

import java.math.BigDecimal;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Produit {
    private Long id = ThreadLocalRandom.current().nextLong(1, Long.MAX_VALUE);
    private String nom;
    private BigDecimal prix;
    private int stock;


    public Produit(String nom, BigDecimal prix, int stock) {
        this.nom = nom;
        this.prix = prix;
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public BigDecimal getPrix() {
        return prix;
    }

    public void setPrix(BigDecimal prix) {
        this.prix = prix;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
