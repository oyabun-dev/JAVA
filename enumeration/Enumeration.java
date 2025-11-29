import java.util.Scanner;

enum Jour {
	LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE;

	public String abbreviation() {
		return this.toString().substring(0, 2);
	}

	public int position() {
		return this.ordinal() + 1;
	}
}

public class Enumeration
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez renseigner votre jour de naissance");
		String reponse = sc.next().toUpperCase();

		Jour jour = Jour.valueOf(reponse);

		System.out.printf("Vous êtes né le %s (%s => %d)", jour, jour.abbreviation(), jour.position());

		// Jour naissance = Jour.DIMANCHE;

		// if (naissance.equals(Jour.MERCREDI))
		// {
		// 	System.out.println("Nous sommes le MERCREDI");
		// }
		// else
		// {
		// 	System.out.println("Nous ne sommes pas le MERCREDI");
		// }
	}
}