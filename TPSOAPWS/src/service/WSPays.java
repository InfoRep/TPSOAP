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
			for (String s : pays)
				System.out.println("WS pays name >> "+s);
		} catch (Exception e) {
			System.out.println(e);
			pays = new ArrayList<String>();
		}

		return pays;
	}
	
	public Pays getPays(String nomPays) {
		
		return null;
	}
}
