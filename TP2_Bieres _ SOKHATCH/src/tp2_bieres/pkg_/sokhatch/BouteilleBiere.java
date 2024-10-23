/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres.pkg_.sokhatch;

/**
 *
 * @author asokhatch
 */
public class BouteilleBiere {
    String nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte;
    
    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;  // Par défaut, la bière n'est pas ouverte
    }
    
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degrés) \nBrasserie : " + brasserie);
        
    }
    public boolean Decapsuler() {
        if (!ouverte) {
            ouverte = true;  // Ouvre la bière
            return true;
        } else {
            System.out.println("Erreur : bière déjà ouverte");
            return false;
        }
    }  
    
    // Redéfinition de la méthode toString() 
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
        if (ouverte) {
            chaine_a_retourner += "oui";
        } else {
            chaine_a_retourner += "non";
        }
        return chaine_a_retourner;
    }
} 
