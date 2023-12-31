/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2022;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author 21655
 */
public class Compagnie implements GestionVol{
     
    List<Vol> list_vol;
    Set<Passager> set_passager;
   
    
    

    public Compagnie() {
        list_vol = new ArrayList<Vol>();
        set_passager = new HashSet<Passager>();
       }
    // hardcoding adding vol w passanger moush db , ekhdemha kif devoir li fet 
    
      public void addPassanger(Passager p){
          set_passager.add(p);
      }

    public boolean Disponibilite(int horaireRech){
        for (Vol vol : list_vol) {
            if(vol.getHeureAtterisage().equals(horaireRech)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercheVol(Vol v) {
           for (Vol vol : list_vol) {
            if(vol.getIDvol()==v.getIDvol()) return true;
        }
        return false;
    }

    @Override
    public boolean ajouterVol(Vol v) {
        if (  !rechercheVol(v) && Disponibilite(v.getHeureAtterisage()) ){
            System.err.println("Vol | horaire exite deja ");
            return false;
        }
        list_vol.add(v);
        return true;
    }

    @Override
    public boolean supprimerVol(Vol v) {
        if(rechercheVol(v)){
            list_vol.remove(v);
            return true;
        }
        return false;
    }

    @Override
    public void AfficherVol(int Horaire) {
        Iterator<Vol> it = list_vol.iterator();
        while (it.hasNext()){
            try{
            Vol v = it.next();
             if(v.getHeureDecollage()==Horaire){
                 System.out.println(v.toString());
                }
             else if (v.getHeureDecollage()<0 || v.getHeureDecollage()>1439) {
                 throw new IllegalArgumentException();
             }
             else {
                 System.out.println("Aucun vol n'est disponible");
             }
        }catch(IllegalArgumentException ex){
                System.out.println(ex.getMessage());
        }
    }
    }
    public void AfficherVols(){
        for (Vol vol : list_vol) {
            System.out.println(vol.toString());
        }
    }
    
    public void AfficheListePassagerTrie(){
        TreeSet<Passager> tree_Passger = new TreeSet<>(new Comparator<Passager>(){
            @Override
            public int compare(Passager p1, Passager p2){
                return p1.getNom().compareTo(p2.getNom());
            }
        });
        tree_Passger.addAll(set_passager);
        for (Passager passager : tree_Passger) {
            System.out.println(passager.toString());
        }
    }
    public void afficheSetNormal(){
        for (Passager passager : set_passager) {
            System.out.println(passager.toString());
        }
    }
    
    
}

