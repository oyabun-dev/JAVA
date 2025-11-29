public class Carre implements FigureGeometrique
{
	private int cote;

	public Carre(int cote)
	{
		this.cote = cote;
	}

	@Override
	public double perimetre()
	{
		return this.cote * 4;
	}

	@Override
	public double surface()
	{
		return this.cote * this.cote;
	}
}