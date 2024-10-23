/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_.sokhatch;

import java.util.Scanner;

/**
 *
 * @author asokhatch
 */
public class TP2_convertisseurObjet_SOKHATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        Convertisseur convertisseur = new Convertisseur();
        
        int choix;
        boolean quitter = false;

        // Boucle principale pour le menu
        while (!quitter) {
            // Afficher le menu
            System.out.println(" Menu Convertisseur ");
            System.out.println("1. Celsius vers Kelvin");
            System.out.println("2. Kelvin vers Celsius");
            System.out.println("3. Fahrenheit vers Celsius");
            System.out.println("4. Celsius vers Fahrenheit");
            System.out.println("5. Fahrenheit vers Kelvin");
            System.out.println("6. Kelvin vers Fahrenheit");
            System.out.println("7. Afficher le nombre de conversions");
            System.out.println("8. Quitter");
            System.out.print("Choisissez une option : ");
            
            choix = scanner.nextInt(); // Lire le choix de l'utilisateur
            
            switch (choix) {
                case 1:
                    // Celsius vers Kelvin
                    System.out.print("Entrez la température en Celsius : ");
                    float celsius = scanner.nextFloat();
                    float kelvin = convertisseur.CelciusVersKelvin(celsius);
                    System.out.println(celsius + "°C est égal à " + kelvin + "K");
                    break;
                    
                case 2:
                    // Kelvin vers Celsius
                    System.out.print("Entrez la température en Kelvin : ");
                    kelvin = scanner.nextFloat();
                    celsius = convertisseur.KelvinVersCelcius(kelvin);
                    System.out.println(kelvin + "K est égal à " + celsius + "°C");
                    break;
                    
                case 3:
                    // Fahrenheit vers Celsius
                    System.out.print("Entrez la température en Fahrenheit : ");
                    float fahrenheit = scanner.nextFloat();
                    celsius = convertisseur.FarenheitVersCelcius(fahrenheit);
                    System.out.println(fahrenheit + "°F est égal à " + celsius + "°C");
                    break;
                    
                case 4:
                    // Celsius vers Fahrenheit
                    System.out.print("Entrez la température en Celsius : ");
                    celsius = scanner.nextFloat();
                    fahrenheit = convertisseur.CelciusVersFarenheit(celsius);
                    System.out.println(celsius + "°C est égal à " + fahrenheit + "°F");
                    break;
                    
                case 5:
                    // Fahrenheit vers Kelvin
                    System.out.print("Entrez la température en Fahrenheit : ");
                    fahrenheit = scanner.nextFloat();
                    kelvin = convertisseur.FarenheitVersKelvin(fahrenheit);
                    System.out.println(fahrenheit + "°F est égal à " + kelvin + "K");
                    break;
                    
                case 6:
                    // Kelvin vers Fahrenheit
                    System.out.print("Entrez la température en Kelvin : ");
                    kelvin = scanner.nextFloat();
                    fahrenheit = convertisseur.KelvinVersFarenheit(kelvin);
                    System.out.println(kelvin + "K est égal à " + fahrenheit + "°F");
                    break;
                    
                case 7:
                    // Afficher le nombre de conversions
                    System.out.println(convertisseur.toString());
                    break;
                    
                case 8:
                    // Quitter
                    System.out.println("Au revoir !");
                    quitter = true;
                    break;
                    
                default:
                    System.out.println("Option invalide, veuillez réessayer.");
                    break;
            }
            
            System.out.println(); // Ligne vide pour l'affichage 
        }
        
        scanner.close(); // Fermer le scanner à la fin
    }

}