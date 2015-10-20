package metier;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import meserreurs.MonException;
import persistance.DialogueBd;

public class PaysRepository {
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
			for (int i = 0; i < rs.size(); ++i)
				noms.add(rs.get(i).toString());			
		}
		
		return noms;
	}
}
