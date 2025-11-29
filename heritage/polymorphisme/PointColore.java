public class PointColore extends Point
{
	private String couleur;

	public PointColore(int x, int y, String couleur)
	{
		super(x, y);
		this.couleur = couleur;
	}

	@Override
	public boolean identique(Point p)
	{
		if (p instanceof PointColore)
		{
			PointColore pc = (PointColore) p;
			return (super.identique(p) && this.couleur.equals(pc.couleur));
		}

		return false;
	}
}