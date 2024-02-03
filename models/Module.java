package models;

import services.serviceOutils;

public class Module implements serviceOutils{
    private String numero;
    private String libelle;
    private int heure;
    
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public int getHeure() {
        return heure;
    }
    public void setHeure(int heure) {
        this.heure = heure;
    }
    public Module(String numero, String libelle, int heure) {
        this.numero = numero;
        this.libelle = libelle;
        this.heure = heure;
    }
    private Enseignant enseignant;

    public Enseignant getEnseignant() {
        return enseignant;
    }
    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }
    @Override
    public void affiche() {
      System.out.println("Libelle"+getLibelle());
      System.out.println("Numero"+getNumero());
      System.out.println("Heure"+getHeure());
    }
}
