/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2022;

/**
 *
 * @author 21655
 */
public class Examen2022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Passager p1 = new Passager("Yassine", "Hammi", "XXX","123");
        Passager p2 = new Passager("Ahmed", "Yahmed", "XXX","123");
        Compagnie c = new Compagnie();
        /// Partie passanger
//        c.addPassanger(p1);
//        c.addPassanger(p2);
//        System.out.println("Affichge trie");
//        c.AfficheListePassagerTrie();
//              Partie vol
           Vol v1 = new Vol("1", "Tunis", "Brest", 1, 5, 15);
           Vol v2 = new Vol("2", "Madrid", "Tokyo", 1, 5, 6);
           Vol v3 = new Vol("3", "Barcelone", "Rome", 1490, 1940, 200);
           System.out.println("----------Ajout vols----------");
           System.out.println(c.ajouterVol(v1));
           System.out.println(c.ajouterVol(v2));
           System.out.println(c.ajouterVol(v3));
        // c.AfficherVols();
         System.out.println("---------Affichage vol avec horaire saisi-----------");

          c.AfficherVol(1);
           
    }
    
}
