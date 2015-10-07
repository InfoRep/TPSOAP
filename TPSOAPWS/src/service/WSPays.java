package service;

import java.util.ArrayList;
import java.util.List;

import metier.PaysRepository;

public class WSPays {

	public List<String> getNamesPays() {
		List<String> pays = null;

		try {
			pays = PaysRepository.getAllName();
		} catch (Exception e) {
			System.out.println(e);
			pays = new ArrayList<String>();
		}

		return pays;
	}
}
