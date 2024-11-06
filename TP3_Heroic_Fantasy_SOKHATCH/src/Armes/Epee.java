/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author asokhatch
 */
public class Epee extends Arme {
    private int finesse; // Finesse de l'épée, valeur < 100

    // Constructeur de Epee
    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque); 
        if (finesse > 100) {
            this.finesse = 100; 
        } else {
            this.finesse = Math.max(finesse, 0); 
        }
    }
   
    public int getFinesse() {
        return finesse;
    }

    @Override
    public String toString() {
        return super.toString() + ", Finesse : " + finesse;
    }
}
