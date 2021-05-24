import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

public class Convertisseur {

	public static void main(String[] args) {
				
		double temp, newTemp, arrondiNewTemp;
		char reponse = ' ', refaire = 'O';
		Scanner clavier = new Scanner(in);
				
		out.println("CONVERTISSEUR DEGRÉS CELSIUS ET DEGRÉS FAHRENHEIT");
		out.println("-------------------------------------------------");
			
		while (refaire == 'O') {
			out.println("Choisissez le mode de conversion :");
			out.println("1 - Celsuis vers Farenheit");
			out.println("2 - Farenheit vers Celsius");
			reponse = clavier.nextLine().charAt(0);
			while (reponse != '1' && reponse != '2') {
				out.println("Mode inconnu. choisissez 1 ou 2.");
				reponse = clavier.nextLine().charAt(0);				
			}
			out.println("Température à convertir :");
			temp = clavier.nextDouble();
			if (reponse == '1') {
				newTemp = ((9*temp)/5) + 32;
				arrondiNewTemp = arrondi (newTemp,2);
				out.println(temp + "°C correspond à : " + arrondiNewTemp + "°F.");					
			} else {
				newTemp = ((temp-32)*5)/9;
				arrondiNewTemp = arrondi (newTemp,2);
				out.println(temp + "°F correspond à : " + arrondiNewTemp + "°C.");					
			}
			out.println("Souhaitez-vous convertir une autre température ? (O/N)");
			clavier.nextLine();
			refaire = clavier.nextLine().charAt(0);	
		}
		
		out.println("Au revoir !");
		clavier.close();
	}
	
	public static double arrondi(double A, int B) {
		return (double) ((int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}
}
