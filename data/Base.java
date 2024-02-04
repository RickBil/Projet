package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import models.Departement;
import models.Enseignant;

public class Base
{
    
    private ObjectOutputStream oos=null;
    private ObjectInputStream ois=null;
	private List<Enseignant> listEnseignants;
    private List<Departement> listDepartement;
    private List<Module> listModules;
	public void ecrireFichierEnseignant(List<Enseignant> listEnseignants) throws FileNotFoundException, IOException
	{
		oos = new ObjectOutputStream(new FileOutputStream("base.dat"));
		oos.writeObject(listEnseignants);
		oos.close();
	}
	public List<Enseignant> lireFichierEnseignant() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		ois = new ObjectInputStream(new FileInputStream("base.dat"));
	    listEnseignants=( List<Enseignant>)ois.readObject();	
	    return listEnseignants;
	}
	public void ecrireFichierDepartement(List<Departement> listDepartements) throws FileNotFoundException, IOException
	{
		oos = new ObjectOutputStream(new FileOutputStream("base.dat"));
		oos.writeObject(listDepartements);
		oos.close();
	}
	public List<Departement> lireFichierDepartement() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		ois = new ObjectInputStream(new FileInputStream("base.dat"));
	    listDepartement = ( List<Departement>)ois.readObject();	
	    return listDepartement;
	}
	public void ecrireFichierModule(List<Module> listModules) throws FileNotFoundException, IOException
	{
		oos = new ObjectOutputStream(new FileOutputStream("base.dat"));
		oos.writeObject(listModules);
		oos.close();
	}
	public List<Module> lireFichierModule() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		ois = new ObjectInputStream(new FileInputStream("base.dat"));
	    listModules=( List<Module>)ois.readObject();	
	    return listModules;
	}
}