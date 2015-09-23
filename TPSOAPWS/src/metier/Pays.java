package metier;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.*;

import persistance.DialogueBd;

import meserreurs.MonException;

public class Pays {

	private String nomPays;
	private String nomCapitale;
	private int nbHabitants;


	public Pays(String nomPays, String nomCapitale, int nbHabitants) {
		this.nomPays = nomPays;
		this.nomCapitale = nomCapitale;
		this.nbHabitants = nbHabitants;
	}
	
	public Pays() {
	
		// TODO Auto-generated constructor stub
	}
	
	public String getnomPays() {
		return nomPays;
	}
	public void setnomPays(String nomPays) {
		this.nomPays = nomPays;
	}
	public String getnomCapitale() {
		return nomCapitale;
	}
	public void setnomCapitale(String nomCapitale) {
		this.nomCapitale = nomCapitale;
	}
	public int getnbHabitants() {
		return nbHabitants;
	}
	public void setnbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	
	
	/**
	 * Trouver un pays selon son ID
	 * @param id : id du pays
	 * @return pays 
	 * @throws MonException
	 * @throws ParseException
	 */
	public static Pays find(String id) throws MonException, ParseException
	{
		String mysql = "SELECT * FROM pays WHERE nomPays = '"+id+"'";
		
		List<Object> rs = DialogueBd.lecture(mysql); 
		Pays pays = null;
		
		if (rs.size() > 0)
		{ //retourner le pays
			// il faut redecouper la liste pour retrouver les lignes
			pays = new Pays();
			pays.setnomPays(rs.get(0).toString());
			pays.setnomCapitale(rs.get(1).toString());
			pays.setnbHabitants( Integer.parseInt(rs.get(2).toString()));
		}
		
        return pays;
	}
	
	public static List<String> getAllName() throws MonException, ParseException
	{
		String mysql = "SELECT nom_pays FROM pays";
		
		List<String> noms = new ArrayList<>();
		List<Object> rs = DialogueBd.lecture(mysql); 
		
		if (rs.size() > 0)
		{ 
			noms.add(rs.get(0).toString());			
		}
		
		return noms;
	}
	
	
}
