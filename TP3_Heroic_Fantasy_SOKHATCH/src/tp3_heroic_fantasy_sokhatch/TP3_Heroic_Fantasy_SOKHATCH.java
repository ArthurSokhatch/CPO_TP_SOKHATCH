/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_sokhatch;

import java.util.ArrayList;
import Armes.*; 
/**
 *
 * @author asokhatch
 */
public class TP3_Heroic_Fantasy_SOKHATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);

        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);
      
        
        // Création d'un tableau dynamique pour stocker les armes
        ArrayList<Arme> armes = new ArrayList<>();

        // Ajout des armes dans le tableau dynamique
        armes.add(excalibur);
        armes.add(durandal);
        armes.add(chene);
        armes.add(charme);

        // Affichage des informations de chaque arme 
        for (int i = 0; i < armes.size(); i++) {
            System.out.println(armes.get(i));
        }
    }
    
}
