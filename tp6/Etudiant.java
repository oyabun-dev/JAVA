public class Etudiant
{
	private int age;
	private String nom, prenom, niveau, filiere;

	public Etudiant(String nom, String prenom, int age, String niveau, String filiere)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.niveau = niveau;
		this.filiere = filiere;
		this.setAge(age);
	}

	public void setAge(int age)
	{
		if (age > 0)
		{
			this.age = age;
		}
		else
		{
			System.err.printf("Erreur : age incorrect (%d)\n", age);
		}
	}

	public void affiche()
	{
		System.out.println("Prénom  : " + this.prenom);
		System.out.println("Nom     : " + this.nom);
		System.out.println("Age     : " + this.age + " ans");
		System.out.println("Niveau  : " + this.niveau);
		System.out.println("Filière : " + this.filiere);
	}

	public String getNom()
	{
		return this.nom;
	}

	public String getPrenom()
	{
		return this.prenom;
	}

	public int getAge()
	{
		return this.age;
	}

	public String getNiveau()
	{
		return this.niveau;
	}

	public String getFiliere()
	{
		return this.filiere;
	}
}