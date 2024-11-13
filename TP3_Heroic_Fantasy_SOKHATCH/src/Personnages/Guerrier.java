/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author asokhatch
 */
public class Guerrier extends Personnage {
    public boolean estAcheval() {
    return estAcheval;
    }

    public Guerrier(String nom, int niveauDeVie, boolean estAcheval) {
        super(nom, niveauDeVie);
        this.estAcheval = estAcheval;
        nombreGuerriers++;
    }

    @Override
    public void attaquer(Personnage cible) {
        int dommages = 30; // Un guerrier inflige 30 de dégâts
        cible.estAttaqué(dommages);
        System.out.println(getNom() + " attaque " + cible.getNom() + " avec son épée !");
        System.out.println(cible.getNom() + " a été attaqué et perd " + dommages + " points de vie. Vie restante : " + cible.getNiveauDeVie());
    }

    @Override
    public String toString() {
        return super.toString() + ", Type : Guerrier, À cheval : " + estAcheval;
    }
}
