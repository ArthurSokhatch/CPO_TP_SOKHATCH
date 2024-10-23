/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres.pkg_.sokhatch;

/** SOKHATCH Arthur
 * TDC
 * @author asokhatch
 */
public class TP2_Bieres_SOKHATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0f ,"Dubuisson") ;     
        
        
        BouteilleBiere secondeBiere = new BouteilleBiere("Leffe", 6.6f, "Abbaye de Leffe") ;  
        
        
        BouteilleBiere biere1 = new BouteilleBiere("Heineken", 5.0f, "Heineken International");      

        
        BouteilleBiere biere2 = new BouteilleBiere("Guinness", 4.2f, "St. James's Gate Brewery"); 

        
        BouteilleBiere biere3 = new BouteilleBiere("Chimay Bleue", 9.0f, "Abbaye de Scourmont");
        // Affichage avec toString()
        // Décapsuler quelques bières
        biere1.Decapsuler();
        biere2.Decapsuler();
        biere3.Decapsuler();

        // Afficher les informations sur chaque bière
        System.out.println(uneBiere);  // Cuvée des trolls
        System.out.println(secondeBiere);  // Leffe
        System.out.println(biere1);  // Heineken
        System.out.println(biere2);  // Chimay Bleue
        System.out.println(biere3);  // Guinness
    }
    
}
