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
    
    private String nom;
    private String prenom;
    private Voiture[] liste_voitures; // Tableau pour stocker jusqu'à 3 voitures
    private int nombreVoitures; // Nombre de voitures possédées

    // Constructeur
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.liste_voitures = new Voiture[3]; // Réservation de mémoire pour 3 voitures
        this.nombreVoitures = 0; // Initialisation du nombre de voitures
    }

    // Méthode pour ajouter une voiture
    public void ajouterVoiture(Voiture voiture) {
        if (nombreVoitures < 3) {
            liste_voitures[nombreVoitures] = voiture;
            nombreVoitures++;
        } else {
            System.out.println("Limite de voitures atteinte !");
        }
    }

    // Méthode toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Personne{").append("nom='").append(nom).append('\'')
                .append(", prenom='").append(prenom).append('\'')
                .append(", voitures={");
        for (int i = 0; i < nombreVoitures; i++) {
            sb.append(liste_voitures[i]);
            if (i < nombreVoitures - 1) {
                sb.append(", ");
            }
        }
        sb.append("}}");
        return sb.toString();
    }
    
}
