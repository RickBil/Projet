package models;

import services.services;

public class EC extends Enseignant implements services{
    
    // protected ArrayList<Module> modules;
    private final double salaireBase = 200000;    
    public static int calcul;


    public EC(String nom, String prenom, String grade) {
        super(nom, prenom, grade);
        // modules = new ArrayList<Module>();
    }


    public double getSalaireBase() {
        return salaireBase;
    }
    public static int getCalcul() {
        return calcul;
    }


    public static void setCalcul(int calcul) {
        EC.calcul = calcul;
    }

    @Override
    public double salaire() {
        
        double brut = (salaireBase +(5000*getCalcul()));
        double taxe = brut *0.1;
        double net = brut - taxe;
        // System.out.println("Salaire : "+net);
        return net;
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
