/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo.pkg2;

import java.util.Scanner;

/** Sokhatch Arthur
 *TDC
 * @author asokhatch
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaration des variables
int nb; // nombre d entiers a additionner 
int result; // resultat
int ind; //indice
//nb=5;
Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer le nombre :");
nb=sc.nextInt();
result=0;
             // Addition des nb premiers entiers
ind=1;
while (ind <= nb) {
               result=result+ind;
               ind++; 
             }
             // Affichage du resultat
             System.out.println();
             System.out.println("La somme des "+ nb + " entiers est: "+result);
            
          }
    }
    

