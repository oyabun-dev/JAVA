public class EtudiantEtranger extends Etudiant
{
	private String paysOrigine;

	public EtudiantEtranger(String nom, String prenom, int age, String niveau, String filiere, String paysOrigine)
	{
		super(nom, prenom, age, niveau, filiere);
		this.paysOrigine = paysOrigine;
	}

	@Override
	public void affiche()
	{
		super.affiche();
		System.out.println("Pays    : " + this.paysOrigine);
	}
}