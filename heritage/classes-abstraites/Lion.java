public class Lion extends Animal
{
	public Lion(String nom)
	{
		super(nom);
	}

	@Override
	public void deplacer()
	{
		System.out.println("Je me déplace avec grâce, comme tout ROI Lion");
	}

	public void rugir()
	{
		System.out.println("Je fais trembler la savane avec mes rugissements");
	}
}