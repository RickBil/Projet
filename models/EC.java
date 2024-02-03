package models;

import services.services;

public class EC extends Enseignant implements services{
   
    private final double salaireBase = 350000;    
    
    public EC(String nom, String prenom, String grade) {
        super(nom, prenom, grade);
    }


    public double getSalaireBase() {
        return salaireBase;
    }

    @Override
    public void salaire() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'salaire'");
    }

    @Override
    public void affiche() {
        System.out.println("Nom : "+getNom());
        System.out.println("Prenom : "+getPrenom());
        System.out.println("Grade : "+getGrade());
        System.out.println("Matricule : "+getMat());

    }
    @Override
    public void ajouterModule(java.lang.Module module) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ajouterModule'");
    }

    @Override
    public void afficheAll() {
        System.out.println("Nom : "+getNom());
        System.out.println("Prenom : "+getPrenom());
        System.out.println("Grade : "+getGrade());
        System.out.println("Matricule : "+getMat());
        System.out.println("Nom du departement : "+this.getDepartement().getNom());
        System.out.println("Code du departement : "+this.getDepartement().getCode());
    }

    
}
