/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_.sokhatch;

/**
 *
 * @author asokhatch
 */
public class Convertisseur {
    
    // Attribut pour compter le nombre de conversions
    private int nbConversions;

    // Constructeur qui initialise nbConversions à 0
    public Convertisseur() {
        nbConversions = 0;
    }

    // Méthode pour convertir de Celsius à Kelvin
    public float CelciusVersKelvin(float celsius) {
        nbConversions++;
        return celsius + 273.15f;
    }

    // Méthode pour convertir de Kelvin à Celsius
    public float KelvinVersCelcius(float kelvin) {
        nbConversions++;
        return kelvin - 273.15f;
    }

    // Méthode pour convertir de Fahrenheit à Celsius
    public float FarenheitVersCelcius(float fahrenheit) {
        nbConversions++;
        return (fahrenheit - 32) * 5 / 9;
    }

    // Méthode pour convertir de Celsius à Fahrenheit
    public float CelciusVersFarenheit(float celsius) {
        nbConversions++;
        return (celsius * 9 / 5) + 32;
    }

    // Méthode pour convertir de Fahrenheit à Kelvin
    public float FarenheitVersKelvin(float fahrenheit) {
        nbConversions++;
        return CelciusVersKelvin(FarenheitVersCelcius(fahrenheit));
    }

    // Méthode pour convertir de Kelvin à Fahrenheit
    public float KelvinVersFarenheit(float kelvin) {
        nbConversions++;
        return CelciusVersFarenheit(KelvinVersCelcius(kelvin));
    }

    // Méthode toString() pour afficher le nombre de conversions
    @Override
    public String toString() {
        return "Nombre de conversions : " + nbConversions;
    }  
    
}
