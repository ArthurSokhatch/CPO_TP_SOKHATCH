/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_.sokhatch;

import java.util.Random;
import java.util.Scanner;

/** SOKHATCH Arthur
 *TDC
 * @author asokhatch
 */
public class TP1_guessMyNumber_SOKHATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
      
        Random generateurAleat = new Random();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choisissez un niveau de difficulté :");
        System.out.println("1. Facile(tentatives ilimitées)");
        System.out.println("2. Normal(10 tentatives)");
        System.out.println("3. Difficile(5 tentatives)");
        int niveau = scanner.nextInt();
        
        
        // Initialise les variables en fonction du niveau de difficulté
        int nombreAleatoire = generateurAleat.nextInt(101);  
        int maxTentatives = 0;  
        boolean aideFacile = false;  
        
        switch (niveau) {
            case 1:  // Mode facile
                maxTentatives = Integer.MAX_VALUE; 
                aideFacile = true;  
                break;
            case 2:  // Mode normal
                maxTentatives = 10; 
                break;
            case 3:  // Mode difficile
                maxTentatives = 5;  
                break;
            default:
                System.out.println("Choix invalide, par défaut en mode normal.");
                maxTentatives = 10;
        }
        
        int utilisateurNombre = -1;  
        int compteurTentatives = 0;  
        
        // Boucle tant que l'utilisateur n'a pas deviné le nombre ou épuisé ses tentatives
        while (utilisateurNombre != nombreAleatoire && compteurTentatives < maxTentatives) {
            System.out.print("Saisissez un nombre entre 0 et 100: ");
            utilisateurNombre = scanner.nextInt();
            compteurTentatives++;
            
            
            int ecart = Math.abs(utilisateurNombre - nombreAleatoire);
            
            if (utilisateurNombre < nombreAleatoire) {
                if (aideFacile && ecart > 20) {
                    System.out.println("Vraiment trop petit !");
                } else {
                    System.out.println("Trop petit !");
                }
            } else if (utilisateurNombre > nombreAleatoire) {
                if (aideFacile && ecart > 20) {
                    System.out.println("Vraiment trop grand !");
                } else {
                    System.out.println("Trop grand !");
                }
            } else {
                System.out.println("Gagné !");
                System.out.println("Nombre de tentatives : " + compteurTentatives);
            }
            
            // Vérifie si les tentatives sont épuisées en mode normal ou difficile
            if (compteurTentatives == maxTentatives && utilisateurNombre != nombreAleatoire) {
                System.out.println("Vous avez épuisé vos tentatives. Le nombre était : " + nombreAleatoire);
            }
        }
        
        // Ferme le scanner
        scanner.close();      
    }
        
}
