/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur.pkg_.sokhatch;

import java.util.Scanner;

/** SOKHATCH Arthur
 *TDC
 * @author asokhatch
 */
public class TP1_convertisseur_SOKHATCH {

    /**
     * @param args the command line arguments
     */
    public static double CelsiusVersKelvin(double tCelsius) {
        // Conversion en Kelvin
        return tCelsius + 273.15;
    }
        // Conversion Kelvin vers Celsius
    public static double KelvinVersCelsius(double tKelvin) {
        return tKelvin - 273.15;
    }

    // Conversion Fahrenheit vers Celsius
    public static double FahrenheitVersCelsius(double tFahrenheit) {
        return (tFahrenheit - 32) * 5 / 9;
    }

    // Conversion Celsius vers Fahrenheit
    public static double CelsiusVersFahrenheit(double tCelsius) {
        return (tCelsius * 9 / 5) + 32;
    }

    // Conversion Kelvin vers Fahrenheit 
    public static double KelvinVersFahrenheit(double tKelvin) {
        double celsius = KelvinVersCelsius(tKelvin);
        return CelsiusVersFahrenheit(celsius);
    }

    // Conversion Fahrenheit vers Kelvin 
    public static double FahrenheitVersKelvin(double tFahrenheit) {
        double celsius = FahrenheitVersCelsius(tFahrenheit);
        return CelsiusVersKelvin(celsius);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        // Demande une valeur à l'utilisateur
        System.out.print("Bonjour, saisissez une valeur : ");
        double valeur = scanner.nextDouble();

        // Menu de conversion
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celsius vers Kelvin");
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Fahrenheit vers Celsius");
        System.out.println("4) De Celsius vers Fahrenheit");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");

        // Choix de l'utilisateur
        int choix = scanner.nextInt();
        
        // Effectuer la conversion selon le choix
        switch (choix) {
            case 1:
                System.out.printf("%.2f degrés Celsius est égal à %.2f degrés Kelvin%n", valeur, CelsiusVersKelvin(valeur));
                break;
            case 2:
                System.out.printf("%.2f degrés Kelvin est égal à %.2f degrés Celsius%n", valeur, KelvinVersCelsius(valeur));
                break;
            case 3:
                System.out.printf("%.2f degrés Fahrenheit est égal à %.2f degrés Celsius%n", valeur, FahrenheitVersCelsius(valeur));
                break;
            case 4:
                System.out.printf("%.2f degrés Celsius est égal à %.2f degrés Fahrenheit%n", valeur, CelsiusVersFahrenheit(valeur));
                break;
            case 5:
                System.out.printf("%.2f degrés Kelvin est égal à %.2f degrés Fahrenheit%n", valeur, KelvinVersFahrenheit(valeur));
                break;
            case 6:
                System.out.printf("%.2f degrés Fahrenheit est égal à %.2f degrés Kelvin%n", valeur, FahrenheitVersKelvin(valeur));
                break;
            default:
                System.out.println("Choix invalide. Veuillez saisir un nombre entre 1 et 6.");
                break;
        }

        // Fermer le scanner
        scanner.close();
               
    }
    
}
