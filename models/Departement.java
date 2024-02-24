package models;

import java.util.ArrayList;

import services.serviceOutils;

public class Departement implements serviceOutils
{
    private String code;
    private String nom;
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Departement(String code, String nom) {
        this.code = code;
        this.nom = nom;
        enseignants = new ArrayList<Enseignant>();
    }
    private ArrayList<Enseignant> enseignants;
    public ArrayList<Enseignant> getEnseignants() {
        return enseignants;
    }
    public void setEnseignants(ArrayList<Enseignant> enseignants) {
        this.enseignants = enseignants;
    }
    @Override
    public void affiche() {
        
        System.out.println("Nom"+getNom());
        System.out.println("Code"+getCode());
        // System.out.println(this.enseignants);
    }
}
