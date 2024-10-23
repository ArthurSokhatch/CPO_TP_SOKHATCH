/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_manip_sokhatch;

/**
 *
 * @author asokhatch
 */
public class Moussaka {
    
     int nbCalories;
     
    public Moussaka(int calories) {
        this.nbCalories = calories;  // On initialise l'attribut nbCalories
    }   
        
        // Méthode pour afficher le nombre de calories
    public void afficherCalories() {
        System.out.println("Moussaka : " + nbCalories + " calories.");
    }
}
