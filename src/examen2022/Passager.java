/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2022;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author 21655
 */
public class Passager {
    private String nom,prenom,email,num;

    public Passager(String nom, String prenom, String email, String num) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.num = num;
    }

    public Passager() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nom);
        hash = 59 * hash + Objects.hashCode(this.prenom);
        hash = 59 * hash + Objects.hashCode(this.email);
        hash = 59 * hash + Objects.hashCode(this.num);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Passager other = (Passager) obj;
     return (!Objects.equals(this.nom, other.nom) &&
             !Objects.equals(this.prenom, other.prenom) && 
             !Objects.equals(this.email, other.email)
             );
       
    }


    @Override
    public String toString() {
        return "Passager{" + "nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", num=" + num + '}';
    }
    
    
}
