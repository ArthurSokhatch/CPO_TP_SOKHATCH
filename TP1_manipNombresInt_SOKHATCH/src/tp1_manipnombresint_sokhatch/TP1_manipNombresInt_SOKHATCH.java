/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_sokhatch;

import java.util.Scanner;

/** SOKHATCH Arthur
 *TDC
 * @author asokhatch
 */
public class TP1_manipNombresInt_SOKHATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir le premier entier
        System.out.print("Veuillez saisir le premier entier : ");
        int entier1 = scanner.nextInt();

        // Demande à l'utilisateur de saisir le deuxième entier
        System.out.print("Veuillez saisir le deuxième entier : ");
        int entier2 = scanner.nextInt();
        // Calcul de la somme, de la différence et du produit
        int somme = entier1 + entier2;
        int difference = entier1 - entier2;
        int produit = entier1 * entier2;
        // Calcul du quotient entier et du reste de la division euclidienne
        double quotient = ( entier1 * 1.0 ) / entier2 ;
        int reste = entier1 % entier2;

        // Affichage des deux entiers saisis
        System.out.println("Vous avez saisi les entiers : " + entier1 + " et " + entier2);
        System.out.println("La somme des deux nombres est : " + somme);
        System.out.println("La différence des deux nombres est : " + difference);
        System.out.println("Le produit des deux nombres est : " + produit);
        System.out.println("Le quotient de la division euclidienne de " + entier1 + " par " + entier2 + " est : " + quotient);
        System.out.println("Le reste de la division euclidienne de " + entier1 + " par " + entier2 + " est : " + reste);
// Fermeture du scanner (bonne pratique)
        scanner.close();
        
        
        
        
    }
    
}
