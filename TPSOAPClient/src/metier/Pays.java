package metier;

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

	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	public String getNomCapitale() {
		return nomCapitale;
	}

	public void setNomCapitale(String nomCapitale) {
		this.nomCapitale = nomCapitale;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	
	@Override
	public String toString() {
		return "["+nomPays+", "+nomCapitale+", "+nbHabitants+"]";
	}
}
