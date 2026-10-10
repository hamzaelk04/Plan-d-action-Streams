package repository;

import model.Commande;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CommandeRepository {
    public Map<Long, Commande> commandes;

//    1. Afficher toutes les clés.
    private List<Long> showAllKeys() {
        List<Long> keys = new ArrayList<>(commandes.keySet());

        return keys;
    }

//    2. Afficher toutes les commandes.
    private List<Commande> showAllCommandes() {
        List<Commande> commandesValues = new ArrayList<>(commandes.values());

        return commandesValues;
    }

//    3. Afficher les couples clé/valeur.
    private List<Map.Entry<Long, Commande>> showAllKeyValue() {
        return new ArrayList<>(commandes.entrySet());
    }

//    4. Afficher l'identifiant de chaque commande à partir de la clé.
    private void showIds() {
        for (Long id : commandes.keySet()) System.out.println(id);
    }

//    5. Afficher le nom du client à partir de la valeur.
    private void showNames() {
        for (Commande commande : commandes.values()) System.out.println(commande.getNomClient());
    }

//    6. Rechercher une commande à partir de son identifiant.
    private Commande findById (Long id) {
        return commandes.get(id);
    }

//    7. Vérifier si une commande existe avec un identifiant donné.
    private boolean isExist(Long id) {
        for (Long key : commandes.keySet()) {
            if (key == id) return true;
        }

        return false;
    }
}