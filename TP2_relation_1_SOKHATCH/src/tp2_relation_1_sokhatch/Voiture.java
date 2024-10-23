/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_sokhatch;

/**
 *
 * @author asokhatch
 */
public class Voiture {
    private String modele;
    private String marque;
    private int puissanceCV;
    public Personne proprietaire; // Référence vers la classe Personne

    // Constructeur
    public Voiture(String modele, String marque, int puissanceCV) {
        this.modele = modele;
        this.marque = marque;
        this.puissanceCV = puissanceCV;
        this.proprietaire = null; // Initialisation à null
    }

    // Méthode toString pour afficher les détails de la voiture
    @Override
    public String toString() {
        return "Voiture{" +
                "modele='" + modele + '\'' +
                ", marque='" + marque + '\'' +
                ", puissanceCV=" + puissanceCV +
                ", proprietaire=" + (proprietaire != null ? proprietaire.prenom + " " + proprietaire.nom : "aucun") +
                '}';
    }
    
}
