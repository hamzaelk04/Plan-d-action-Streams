package model;

import model.enums.StatutCommande;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class Commande {
    private Long id = ThreadLocalRandom.current().nextLong(1, Long.MAX_VALUE);
    private String nomClient;
    private Produit produit;
    private int quantite;
    private LocalDate dateCommande;
    private LocalDate dateLivraison;
    private StatutCommande statut;

    public Commande(String nomClient, Produit produit, int quantite, LocalDate dateCommande, LocalDate dateLivraison, StatutCommande statut) {
        this.nomClient = nomClient;
        this.produit = produit;
        this.quantite = quantite;
        this.dateCommande = dateCommande;
        this.dateLivraison = dateLivraison;
        this.statut = statut;
    }

    public Long getId() {
        return id;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public LocalDate getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(LocalDate dateCommande) {
        this.dateCommande = dateCommande;
    }

    public LocalDate getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(LocalDate dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public StatutCommande getStatut() {
        return statut;
    }

    public void setStatut(StatutCommande statut) {
        this.statut = statut;
    }
}
