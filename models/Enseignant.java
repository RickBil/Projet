package models;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Enseignant implements Serializable{
    
    protected int mat;
    protected String nom;
    protected String prenom;
    protected String grade;
    private static int compteur = 0;
    protected ArrayList<Module> modules;
    protected Departement departement;

    public Enseignant(String nom, String prenom, String grade) {
        this.nom = nom;
        this.prenom = prenom;
        this.grade = grade;
        mat = compteur++;
        modules = new ArrayList<Module>();
    }
    public Enseignant() {
    }
    public int getMat() {
        return mat;
    }
    public void setMat(int mat) {
        this.mat = mat;
    }
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
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
    
    public int getCompteur() {
        return compteur;
    }
    
    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }
    public Departement getDepartement() {
        return departement;
    }
    public void setDepartement(Departement departement) {
        this.departement = departement;
    }
    
}
