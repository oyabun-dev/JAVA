public class PointColore
{
	private int x, y;
	private String couleur;

	public PointColore() {}

	public PointColore(int x, int y, String couleur)
	{
		this.x = x;
		this.y = y;
		this.couleur = couleur;
	}

	public String toString()
	{
		return String.format("(%d, %d, %s)", this.x, this.y, this.couleur);
	}
}