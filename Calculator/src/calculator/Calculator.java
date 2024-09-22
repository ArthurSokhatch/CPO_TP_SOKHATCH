/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/** Sokhatch Arthur
 *TDC
 * @author asokhatch
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        
        // Afficher le menu
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) subtract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        int operateur = scanner.nextInt();  
        
        
        if (operateur < 1 || operateur > 5) {
            System.out.println("Error: Invalid operator selected. Please choose a number between 1 and 5.");
        } else {
        System.out.println("Entrer une première valeur:");
        int operande1 = scanner.nextInt(); 
        System.out.println("Entrer une seconde valeur:");
        int operande2 = scanner.nextInt(); 
        
        
        int resultat = 0;
        boolean operationValide = true;

        // Effectuer l'opération en fonction de l'opérateur choisi
        if (operateur == 1) { // Addition
            resultat = operande1 + operande2;
        } else if (operateur == 2) { // Soustraction
            resultat = operande1 - operande2;
        } else if (operateur == 3) { // Multiplication
            resultat = operande1 * operande2;
        } else if (operateur == 4) { // Division
            if (operande2 != 0) {
                resultat = operande1 / operande2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                operationValide = false;
            }
        } else if (operateur == 5) { // Modulo
            if (operande2 != 0) {
                resultat = operande1 % operande2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                operationValide = false;
            }
        } else {
            System.out.println("Error: Invalid operator selected.");
            operationValide = false;
        }

        // Afficher le résultat si l'opération est valide
        if (operationValide) {
            System.out.println("Le resultat est: " + resultat);
        }

        // Fermer le scanner
        scanner.close();
          }        
    }
        
}  

