public class Rectangle implements FigureGeometrique
{
	private int longueur, largeur;

	public Rectangle(int longueur, int largeur)
	{
		this.largeur = largeur;
		this.longueur = longueur;
	}

	@Override
	public double perimetre()
	{
		return (this.longueur + this.largeur) * 2;
	}

	@Override
	public double surface()
	{
		return this.longueur * this.largeur;
	}
}