/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_sokhatch;

/**
 *
 * @author asokhatch
 */
public class TP2_manip_SOKHATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here`
        // Création de deux tartiflettes avec des calories différentes
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);

         // Affichage des calories avant l'échange
        System.out.println("Avant l'échange :");
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);

        // Échange des objets référencés par assiette1 et assiette2
        Tartiflette temp = assiette1; // On stocke la référence de assiette1 dans temp
        assiette1 = assiette2;        // On affecte assiette2 à assiette1
        assiette2 = temp;             // On affecte la référence stockée dans temp à assiette2

        // Affichage des calories après l'échange
        System.out.println("Après l'échange :");
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        
        
        // Création d'un tableau de 10 références de type Moussaka
        Moussaka[] moussakas = new Moussaka[10];

        // Instanciation des objets Moussaka
        for (int i = 0; i < moussakas.length; i++) {
            moussakas[i] = new Moussaka(500 + (i * 50));  // Exemple : 500, 550, ..., 1000 calories
        }

        // Affichage des calories de chaque Moussaka
        for (Moussaka moussaka : moussakas) {
            moussaka.afficherCalories();
        }
    }
        
}
