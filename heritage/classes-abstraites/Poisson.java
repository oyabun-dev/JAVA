public class Poisson extends Animal
{
	public Poisson(String nom)
	{
		super(nom);
	}

	@Override
	public void deplacer()
	{
		System.out.println("Je nage fièrement en tant que Poisson");
	}
}