public class TestClasse
{
	public static void main (String args[])
	{
		Classe l1Maths = new Classe(4);
		l1Maths.ajouterEtudiant (new Etudiant ("Sène", "Pierre", 12, "L1", "Maths"));
		l1Maths.ajouterEtudiant (new EtudiantEtranger ("Tall", "Moussa", 20 , "L1", "Maths","Mauritanie"));
		l1Maths.ajouterEtudiant (new Etudiant ("Fall", "Anta", 17, "L1", "Maths"));
		l1Maths.afficherListe();
	}
}