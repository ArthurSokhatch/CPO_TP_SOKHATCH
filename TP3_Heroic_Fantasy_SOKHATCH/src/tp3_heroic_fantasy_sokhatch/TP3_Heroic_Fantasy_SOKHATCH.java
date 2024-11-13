/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_sokhatch;

import java.util.ArrayList;
import Armes.*; 
import Personnages.*;
/**
 *
 * @author asokhatch
 */
public class TP3_Heroic_Fantasy_SOKHATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création de personnages
        // Créer un guerrier et un magicien
        Guerrier guerrier = new Guerrier("Conan", 78, false);
        Magicien magicien = new Magicien("Gandalf", 65, true);

        // Afficher les caractéristiques des personnages
        System.out.println(guerrier);
        System.out.println(magicien);

        // Afficher le nombre de personnages, de guerriers et de magiciens
        System.out.println("Nombre total de personnages : " + Personnage.getNombrePersonnages());
        System.out.println("Nombre de guerriers : " + Guerrier.getNombreGuerriers());
        System.out.println("Nombre de magiciens : " + Magicien.getNombreMagiciens());

        // Fatiguer le guerrier
        guerrier.seFatiguer();

        // Afficher les caractéristiques du guerrier après qu'il soit fatigué
        System.out.println(guerrier);
        // Vérifier s'il est toujours vivant
        if (guerrier.estVivant()) {
            System.out.println(guerrier.getNom() + " est toujours vivant !");
        } else {
            System.out.println(guerrier.getNom() + " est mort...");
        }

        // Faire en sorte que le magicien soit attaqué par le guerrier
        guerrier.attaquer(magicien);

        // Afficher les caractéristiques du magicien et du guerrier après l'attaque
        System.out.println(guerrier);
        System.out.println(magicien);

        // Vérifier si le magicien est toujours vivant
        if (magicien.estVivant()) {
            System.out.println(magicien.getNom() + " est toujours vivant !");
        } else {
            System.out.println(magicien.getNom() + " est mort...");
        }
    }
 }        