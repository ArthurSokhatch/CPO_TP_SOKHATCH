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
public class Baton extends Arme {
    private int age; 

    // Constructeur de Baton
    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque); 
        if (age > 100) {
            this.age = 100; 
        } else {
            this.age = Math.max(age, 0); 
        }
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return super.toString() + ", Âge : " + age;
    }
}
