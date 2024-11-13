/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import tp3_heroic_fantasy_sokhatch.etreVivant;



/**
 *
 * @author asokhatch
 */
public abstract class Personnage implements etreVivant {
    private String nom;
    private int niveauDeVie;
    public static int nombrePersonnages = 0;
    public static int nombreGuerriers = 0;
    public static int nombreMagiciens = 0;

    public Personnage(String nom, int niveauDeVie) {
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
        nombrePersonnages++;
    }

    public String getNom() {
        return nom;
    }

    public int getNiveauDeVie() {
        return niveauDeVie;
    }

    public void setNiveauDeVie(int niveauDeVie) {
        this.niveauDeVie = niveauDeVie;
    }

    public static int getNombrePersonnages() {
        return nombrePersonnages;
    }

    public static int getNombreGuerriers() {
        return nombreGuerriers;
    }

    public static int getNombreMagiciens() {
        return nombreMagiciens;
    }

    @Override
    public String toString() {
        return "Personnage : " + nom + ", Niveau de vie : " + niveauDeVie;
    }

    @Override
    public void seFatiguer() {
        this.niveauDeVie -= 10; // Chaque fatigue réduit de 10 les points de vie
    }

    @Override
    public boolean estVivant() {
        return niveauDeVie > 0;
    }

    @Override
    public void estAttaqué(int points) {
        this.niveauDeVie -= points;
    }

    @Override
public void attaquer(Personnage cible) {
    int dommages = 0;
    
    // Vérifier si le personnage est armé et que l'arme est valide
    if (this.Arme_en_Main != null) {
        // Récupérer le niveau d'attaque de l'arme
        int attaqueDeLArme = this.Arme_en_Main.getNiveauAttaque();
        
        // Si c'est un magicien et qu'il utilise un bâton
        if (this instanceof Magicien && this.Arme_en_Main instanceof Baton) {
            Baton baton = (Baton) this.Arme_en_Main;
            dommages = attaqueDeLArme * baton.getAge();
        } 
        // Si c'est un guerrier et qu'il utilise une épée
        else if (this instanceof Guerrier && this.Arme_en_Main instanceof Epee) {
            Epee epee = (Epee) this.Arme_en_Main;
            dommages = attaqueDeLArme * epee.getFinesse();
        } 
        // Sinon, simplement les dommages de base de l'arme
        else {
            dommages = attaqueDeLArme;
        }

        // Appliquer la réduction des dommages si le personnage est confirmé (magicien)
        // ou est à cheval (guerrier)
        if ((this instanceof Magicien && ((Magicien) this).estConfirme()) || 
            (this instanceof Guerrier && ((Guerrier) this).estAcheval())) {
            dommages /= 2;
        }

        // Fatiguer le personnage
        this.seFatiguer();

        // Attaque le personnage cible
        cible.estAttaqué(dommages);

        System.out.println(this.getNom() + " attaque " + cible.getNom() + " !");
        System.out.println("Dégâts infligés : " + dommages);
        System.out.println(cible.getNom() + " a maintenant " + cible.getNiveauDeVie() + " points de vie.");
    } else {
        System.out.println(this.getNom() + " n'a pas d'arme équipée !");
        }
}
}   

