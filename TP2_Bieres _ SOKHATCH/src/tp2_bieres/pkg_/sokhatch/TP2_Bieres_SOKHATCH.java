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
        uneBiere.lireEtiquette();
        
        
        BouteilleBiere secondeBiere = new BouteilleBiere("Leffe", 6.6f, "Abbaye de Leffe") ;
        secondeBiere.lireEtiquette();
        
        
        BouteilleBiere biere1 = new BouteilleBiere("Heineken", 5.0f, "Heineken International");
        biere1.lireEtiquette();

        
        BouteilleBiere biere2 = new BouteilleBiere("Guinness", 4.2f, "St. James's Gate Brewery");
        biere2.lireEtiquette();

        
        BouteilleBiere biere3 = new BouteilleBiere("Chimay Bleue", 9.0f, "Abbaye de Scourmont");
        biere3.lireEtiquette();
        
        
       
        boolean result = uneBiere.Decapsuler();
        System.out.println("Décapsulage réussi : " + result);  

        
        result = uneBiere.Decapsuler();
        System.out.println("Décapsulage réussi : " + result);  
    }
    
}
