public class Classe
{
	private Etudiant etudiants[];
	private int effectif;

	public Classe(int maxEt)
	{
		this.effectif  = 0;
		this.etudiants = new Etudiant[maxEt];
	}

	public void ajouterEtudiant(Etudiant e)
	{
		if (effectif < this.etudiants.length)
		{
			if (this.effectif == 0)
			{
				this.etudiants[0] = e;
				this.effectif++;
			}
			else if(this.etudiants[0].getNiveau().equals(e.getNiveau()) &&
					this.etudiants[0].getFiliere().equals(e.getFiliere()))
			{
				this.etudiants[this.effectif] = e;
				this.effectif++;
			}
			else
			{
				System.out.printf(
					"Echec de l'ajout de %s %s : incompatibilité de filière et/ou de niveau !\n",
					e.getPrenom(), e.getNom()
				);
			}
		}
		else
		{
			System.out.printf("Echec de l'ajout de %s %s : classe pleine\n", e.getPrenom(), e.getNom());
		}
	}

	public void afficherListe()
	{
		if (this.effectif == 0)
		{
			System.out.println("La classe ne dispose pas encore d'étudiants");
		}
		else
		{
			String niveau = this.etudiants[0].getNiveau().toUpperCase();
			String filiere = this.etudiants[0].getFiliere().toUpperCase();

			System.out.println("=============================");
			System.out.printf ("Liste de la classe %s - %s\n", niveau, filiere);
			System.out.println("=============================");

			for (int i = 0; i < this.effectif; i++)
			{
				this.etudiants[i].affiche();
				System.out.println("--------------------------");
			}
		}
	}
}