/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_sokhatch;

/**
 *
 * @author asokhatch
 */
public class Personne {
    
    public String nom;
    public String prenom;
    public int nbVoitures;
    public Voiture[] liste_voitures;

    // Constructeur
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.nbVoitures = 0; // Initialisation à 0
        this.liste_voitures = new Voiture[3]; // Réservation de mémoire pour 3 voitures
    }

    // Méthode toString pour afficher les détails de la personne
    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nbVoitures=" + nbVoitures +
                '}';
    }

    // Méthode pour ajouter une voiture
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        // Vérifier si la voiture a déjà un propriétaire
        if (voiture_a_ajouter.proprietaire != null) {
            return false; // Voiture déjà possédée
        }
        // Vérifier si la personne a déjà 3 voitures
        if (nbVoitures >= 3) {
            return false; // Limite de voitures atteinte
        }
        // Ajouter la voiture
        liste_voitures[nbVoitures] = voiture_a_ajouter; // Ajout à la liste
        nbVoitures++; // Incrémenter le nombre de voitures
        voiture_a_ajouter.proprietaire = this; // Définir le propriétaire
        return true; // Ajout réussi
    }
    
}
