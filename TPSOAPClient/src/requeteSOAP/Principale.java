package requeteSOAP;

public class Principale {

	private static String operation = "getAddition";
	private static String destenvoi = "http://localhost:8080/PWSCalcul/services/Calculette";
	private static String destination = "http://calcul"; // Nom du package

	private static float a = 50;
	private static float b = 6;

	private static EnvoiMessageSOAP unAppel = new EnvoiMessageSOAP();
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			unAppel.connexion();
			unAppel.creationMessage(operation, a, b, destination);
			unAppel.EmmissionReception(destenvoi, a, b);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
*/
}
