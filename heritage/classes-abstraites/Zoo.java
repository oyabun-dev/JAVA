public class Zoo
{
	public static void main(String[] args)
	{
		Animal animal = new Lion("Simba");

		animal.deplacer();


		Lion lion = new Lion("Simba");
		lion.deplacer();

		Poisson poisson = new Poisson("Simba");
		poisson.deplacer();
	}
}