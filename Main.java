import data.Base;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import data.Base;
import models.Departement;
import models.EC;
import models.EV;
import models.Enseignant;
import models.Grade;
import models.Module;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        List<Enseignant> listEnseignants = new ArrayList<Enseignant>();
        List<Departement> listDepartements = new ArrayList<Departement>();
        List<Module> listModules = new ArrayList<Module>();
        Scanner sc = new Scanner(System.in);
        String nom,nomd, prenom, grade, code,libelle,numero;
        Base base  = new Base();
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
                    nomd = sc.next();
                    Departement x = new Departement(code,nomd);
                    listDepartements.add(x);
                    base.ecrireFichierDepartement(listDepartements);
                    break;
                case 2:
                    listDepartements = base.lireFichierDepartement();
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
                    Module x1 = new Module(numero,libelle,heure);
                    listModules.add(x1);
                    base.ecrireFichierModule(listModules);
                    break;                
                case 4:
                    System.out.println("Quel type d'enseignant voulez créer ?");
                    System.out.println("1 : Enseignant Chercher");
                    System.out.println("2 : Enseignant Vacataire");
                    System.out.println("3 : Retour");
                    int c = sc.nextInt();
                    do {
                        switch (c){
                            case 1:
                                System.out.println("Saisir les informations de l'Enseignant Chercher");
                                System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --");
                                System.out.println("Saisir le nom");
                                nom = sc.next();
                                System.out.println("Saisir le prenom");
                                prenom = sc.next();
                                System.out.println("Saisir le grade Ingenieur/Docteur/Professeur");
                                grade = sc.next();
                                Enseignant x2 = new EC(nom,prenom,grade);
                                listEnseignants.add(x2);
                                break;
                            case 2:
                                System.out.println("Saisir les informations de l'Enseignant Vacataire");
                                System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --");
                                System.out.println("Saisir le nom");
                                nom = sc.next();
                                System.out.println("Saisir le prenom");
                                prenom = sc.next();
                                System.out.println("Saisir le grade Ingenieur/Docteur/Professeur");
                                grade = sc.next();
                                Enseignant x3 = new EV(nom,prenom,grade);
                                listEnseignants.add(x3);
                                break;
                            case 3:
                                System.out.println("Retour");
                                break;
                        }
                    } while (c !=3);
                    break;                
                case 5:
                System.out.println("Lister les enseignants ");
                System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --");
                System.out.println("1 : Lister tous les enseignants ");
                System.out.println("2 : Lister les enseignants chercher");
                System.out.println("3 : Lister les enseignants vacataire");
                System.out.println("4 : Retour");
                    int w = sc.nextInt();
                    do {
                        
                    } while (w != 4);
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
