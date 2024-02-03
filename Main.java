import java.util.ArrayList;
import java.util.Scanner;

import models.Departement;
import models.EC;
import models.Enseignant;
import models.Grade;

public class Main {
    public static void main(String[] args) {
        ArrayList<Enseignant> listEnseignants = new ArrayList<Enseignant>();
        ArrayList<Departement> listDepartements = new ArrayList<Departement>();
        ArrayList<Module> listModules = new ArrayList<Module>();
        Scanner sc = new Scanner(System.in);
        String nom, prenom, grade, code,libelle,numero;
        int heure;
        int choix=0;
        do {
            System.out.println("1 : Ajouter un departement : ");
            System.out.println("2 : Lister les departements : ");
            System.out.println("3 : Ajouter un module : ");
            System.out.println("4 : Lister les modules : ");
            System.out.println("5 : Ajouter un enseignant : ");
            System.out.println("6 : Lister les enseignants : ");
            System.out.println("7 : Faire une affectation : ");
            System.out.println("8 : Voir les salaires : ");
            System.out.println("9 : Quitter l'application : ");
            choix = sc.nextInt();
            sc.nextInt();
            switch (choix) {
                
                case 1:
                    System.out.println("Entrer les informations du department ");
                    System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- --");
                    System.out.println("Saisir le code : ");
                    code = sc.next();
                    System.out.println("Saisir le nom : ");
                    nom = sc.next();
                    Departement x = new Departement(code,nom);
                    listDepartements.add(x);
                    break;
                case 2:
                    for (Departement i : listDepartements) 
                    {
                        System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- --");
                        i.affiche();
                    }
                    {
                        System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --");
                    }
                    break;
                case 3:
                    System.out.println("Entrer les informations du module ");
                    System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --");
                    System.out.println("Saisir le numero : ");
                    numero = sc.next();
                    System.out.println("Saisir le libelle : ");
                    libelle = sc.next();
                    System.out.println("Entrer le volume horaire : ");
                    heure = sc.nextInt();
                    break;                
                case 4:
                    break;                
                case 5:
                    break; 
                case 6:
                    break;                
                case 7:
                    break;                
                case 8:
                    break;
                default:
                    System.out.println("fin");
            }
        }
        while (choix != 9);
       System.out.println("Fin Application");
         
    }
};
