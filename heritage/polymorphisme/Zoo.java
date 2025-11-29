public class Zoo
{
	public static void main(String[] args)
	{
		Animal animal = new Lion("Simba");
		animal.deplacer();
		// animal.rugir();

		Animal animaux[] = {
			new Lion("Simba"),
			new Poisson("Zuu"),
			new Lion("Miri"),
			new Animal("Bukki")
		};

		System.out.println("========================");
		System.out.println("Déplacement des animaux");
		System.out.println("========================");

		for (Animal animal : animaux)
		{
			animal.deplacer();
			System.out.println("========");
		}
	}
}