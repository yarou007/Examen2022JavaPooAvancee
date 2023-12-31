/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2022;

/**
 *
 * @author 21655
 */
public class Vol {
    
    private String IDvol;
    private String Dep,Arr;
    private int HeureDecollage,HeureAtterisage,nbPlace;

    public Vol() {
    }

    public Vol(String IDvol, String Dep, String Arr, int HeureDecollage, int HeureAtterisage, int nbPlace) {
        this.IDvol = IDvol;
        this.Dep = Dep;
        this.Arr = Arr;
        this.HeureDecollage = HeureDecollage;
        this.HeureAtterisage = HeureAtterisage;
        this.nbPlace = nbPlace;
    }

    public String getIDvol() {
        return IDvol;
    }

    public void setIDvol(String IDvol) {
        this.IDvol = IDvol;
    }

    public String getDep() {
        return Dep;
    }

    public void setDep(String Dep) {
        this.Dep = Dep;
    }

    public String getArr() {
        return Arr;
    }

    public void setArr(String Arr) {
        this.Arr = Arr;
    }

    public int getHeureDecollage() {
        return HeureDecollage;
    }

    public void setHeureDecollage(int HeureDecollage) {
        this.HeureDecollage = HeureDecollage;
    }

    public int getHeureAtterisage() {
        return HeureAtterisage;
    }

    public void setHeureAtterisage(int HeureAtterisage) {
        this.HeureAtterisage = HeureAtterisage;
    }

    public int getNbPlace() {
        return nbPlace;
    }

    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }

    @Override
    public String toString() {
        return "Vol{" + "IDvol=" + IDvol + ", Dep=" + Dep + ", Arr=" + Arr + ", HeureDecollage=" + HeureDecollage + ", HeureAtterisage=" + HeureAtterisage + ", nbPlace=" + nbPlace + '}';
    }
    
    
    
}
