/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author asokhatch
 */
public class Magicien extends Personnage {
    public boolean estConfirme() {
    return estConfirme;
}

    public Magicien(String nom, int niveauDeVie, boolean estConfirme) {
        super(nom, niveauDeVie);
        this.estConfirme = estConfirme;
        nombreMagiciens++;
    }

    @Override
    public void attaquer(Personnage cible) {
        int dommages = 20; // Un magicien inflige 20 de dégâts
        cible.estAttaqué(dommages);
        System.out.println(getNom() + " attaque " + cible.getNom() + " avec sa magie !");
        System.out.println(cible.getNom() + " a été attaqué et perd " + dommages + " points de vie. Vie restante : " + cible.getNiveauDeVie());
    }

    @Override
    public String toString() {
        return super.toString() + ", Type : Magicien, Confirmé : " + estConfirme;
    }
    
}
