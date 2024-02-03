package models;

import java.util.ArrayList;

import services.services;

public class EV extends Enseignant implements services {
    
    private double salaireH;
    private double TH;
    public static int calcul;
    public static double var;
    // protected ArrayList<Module> modules;
    
    public EV(String nom, String prenom, String grade, double salaireH, double tH) {
        super(nom, prenom, grade);
        this.salaireH = salaireH;
        TH = tH;
        modules = new ArrayList<Module>();
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
        String x;
        String y = "Ingenieur";
        String w = "Doctor";
        String z = "Professeur";
        x = getGrade();
        if (x==y) {
             var = (10000*getCalcul());
        }else if ( x==w ){
             var = (15000*getCalcul());
        }else if ( x==z ){
             var = (25000*getCalcul());
        }
        double brut = var;
        double taxe = brut *0.05;
        double net = brut - taxe;
        System.out.println("Salaire : "+net);
      
    }
    public static int getCalcul() {
        return calcul;
    }
    public static void setCalcul(int calcul) {
        EV.calcul = calcul;
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
