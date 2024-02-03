package models;

import services.services;

public class EV extends Enseignant implements services {
    
    private double salaireH;
    private double TH;
    
    public EV(String nom, String prenom, String grade, double salaireH, double tH) {
        super(nom, prenom, grade);
        this.salaireH = salaireH;
        TH = tH;
    }
    public double getSalaireH() {
        return salaireH;
    }

    public void setSalaireH(double salaireH) {
        this.salaireH = salaireH;
    }

    
    public double getTH() {
        return TH;
    }
    public void setTH(double tH) {
        TH = tH;
    }


    @Override
    public void salaire() {
        // TODO Auto-generated method stub
      
    }

    @Override
    public void affiche() {
        String x;
        String y = "Ingenieur";
        String w = "Doctor";
        String z = "Professeur";
        System.out.println("Nom : "+getNom());
        System.out.println("Prenom : "+getPrenom());
        System.out.println("Grade : "+getGrade());
        x = getGrade();
        if (x==y) {
            System.out.println("Le taux horaire : "+Grade.Ingenieur.getTauxH());
        }else if ( x==w ){
            System.out.println("Le taux horaire : "+Grade.Doctor.getTauxH());
        }else if ( x==z ){
            System.out.println("Le taux horaire : "+Grade.Professeur.getTauxH());
        }
        System.out.println("Matricule : "+getMat());
        // System.out.println("Nom du departement : "+this.getDepartement().getNom());
        // System.out.println("Code du departement : "+this.getDepartement().getCode());
    }

    @Override
    public void ajouterModule(java.lang.Module module) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ajouterModule'");
    }
    @Override
    public void afficheAll() {
        String x;
        String y = "Ingenieur";
        String w = "Doctor";
        String z = "Professeur";
        System.out.println("Nom : "+getNom());
        System.out.println("Prenom : "+getPrenom());
        System.out.println("Grade : "+getGrade());
        x = getGrade();
        if (x==y) {
            System.out.println("Le taux horaire : "+Grade.Ingenieur.getTauxH());
        }else if ( x==w ){
            System.out.println("Le taux horaire : "+Grade.Doctor.getTauxH());
        }else if ( x==z ){
            System.out.println("Le taux horaire : "+Grade.Professeur.getTauxH());
        }
        System.out.println("Matricule : "+getMat());
        System.out.println("Nom du departement : "+this.getDepartement().getNom());
        System.out.println("Code du departement : "+this.getDepartement().getCode());
    }
    

    
    
}
