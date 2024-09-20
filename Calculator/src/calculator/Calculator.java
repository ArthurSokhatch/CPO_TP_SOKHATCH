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
        System.out.println("Entrer une première valeur:");
        int operande1 = scanner.nextInt(); 
        System.out.println("Entrer une seconde valeur:");
        int operande2 = scanner.nextInt(); 
        
           
        
    
       
            
    }
    
}
