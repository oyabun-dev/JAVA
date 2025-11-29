public class Point
{
	private int x, y;

	public Point() {}

	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public boolean identique(Point p)
	{
		return (this.x == p.x && this.y == p.y);
	}

	@Override
	public String toString()
	{
		return String.format("(%d, %d)", this.x, this.y);
	}

	@Override
	public boolean equals(Object o)
	{
		if (o instanceof Point)
		{
			Point p = (Point) o;
			return this.x == p.x && this.y == p.y;
		}

		return false;
	}
}