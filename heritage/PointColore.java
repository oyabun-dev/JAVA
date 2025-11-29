public class PointColore extends Point
{
	private String couleur;

	public PointColore() {}

	public PointColore(int x, int y, String couleur)
	{
		super(x, y);
		// super.x = x;
		// super.y = y;
		this.couleur = couleur;
	}

	@Override
	public String toString()
	{
		// return super.toString() + ", de couleur " + this.couleur;
		return String.format("(%d, %d, %s)", this.getX(), this.getY(), this.couleur);
	}
}