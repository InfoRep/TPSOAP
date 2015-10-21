package service;

import java.util.ArrayList;
import java.util.List;

import metier.Pays;
import metier.PaysRepository;

public class WSPays {

	public List<String> getNamesPays() {
		List<String> pays = null;
		System.out.println("WS >> get liste de pays");

		try {
			pays = PaysRepository.getAllName();
			System.out.println("WS >> taille liste = "+pays.size());
		} catch (Exception e) {
			System.out.println(e);
			pays = new ArrayList<String>();
		}

		return pays;
	}
	
	public Pays getPays(String nomPays) 
	{
		Pays pays = null;
		try {
			System.out.println("WS >> search for "+nomPays);
			pays = PaysRepository.find(nomPays);
			
			System.out.println("WS >> pays found: "+pays);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return pays;
	}
}
