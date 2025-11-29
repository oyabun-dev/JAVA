public class Demo
{
	public static void main(String[] args)
	{
		FigureGeometrique figures[] = {
			new Carre(5),
			new Rectangle(3, 4),
			new Cercle(6),
			new Rectangle(5, 3)
		};

		for (FigureGeometrique figure : figures)
		{
			System.out.println("Périmètre = " + figure.perimetre());
			System.out.println("Surface   = " + figure.surface());
			System.out.println("-------------------------------");
		}
	}
}