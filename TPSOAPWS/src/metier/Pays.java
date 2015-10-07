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
}
