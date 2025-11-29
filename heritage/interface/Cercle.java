public class Cercle implements FigureGeometrique
{
	private int rayon;

	public Cercle(int rayon)
	{
		this.rayon = rayon;
	}

	@Override
	public double perimetre()
	{
		return 2 * Math.PI * this.rayon;
	}

	@Override
	public double surface()
	{
		return Math.PI * this.rayon * this.rayon;
	}
}