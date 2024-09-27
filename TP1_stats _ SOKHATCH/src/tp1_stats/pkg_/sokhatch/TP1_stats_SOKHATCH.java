/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats.pkg_.sokhatch;

import java.util.Random;
import java.util.Scanner;

/** SOKHATCH Arthur
 *TDC
 * @author asokhatch
 */
public class TP1_stats_SOKHATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Création du tableau
        int[] facesDe = new int[6];

        // Création d'un Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Demander à l'utilisateur de saisir un nombre entier m
        System.out.print("Veuillez saisir un nombre entier m : ");
        int m = scanner.nextInt();
       
        Random random = new Random();

        for (int i = 0; i < m; i++) {           
            int tirage = random.nextInt(6); 

            // Incrémenter la case du tableau correspondant au tirage
            facesDe[tirage]++;
        }

        // Afficher les résultats du tableau après m itérations
        System.out.println("\nRésultats après " + m + " itérations (en pourcentages) :");
        for (int i = 0; i < facesDe.length; i++) {
            double pourcentage = ((double) facesDe[i] / m) * 100;
           
            System.out.printf("Face %d : %.2f%%\n", (i + 1), pourcentage);
        }       
        scanner.close();       
    }
    
}
