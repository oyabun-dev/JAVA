public class LimiteCouplage
{
	public static void main(String[] args)
	{
		Point p1 = new Point(3, 2);
		Point p2 = new Point(3, 2);
		Point p3 = p1;

		System.out.println("p1 = " + p1);

		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));


		// Point p1 = new PointColore(3, 2, "JAUNE");
		// Point p2 = new PointColore(3, 2, "ROUGE");

		// System.out.println("p1.identique(p2) = " + p1.identique(p2));
		// System.out.println(p1.toString());

		/*		
		Point p1 = new Point(3, 2);
		Point p2 = new Point(3, 4);
		Point p3 = new Point(3, 2);

		PointColore pc1 = new PointColore(3, 2, "JAUNE");
		PointColore pc2 = new PointColore(3, 4, "JAUNE");
		PointColore pc3 = new PointColore(3, 2, "JAUNE");

		System.out.println("p1.identique(p2)   = " + p1.identique(p2));
		System.out.println("p1.identique(p3)   = " + p1.identique(p3));

		System.out.println("pc1.identique(pc2) = " + pc1.identique(pc2));
		System.out.println("pc1.identique(pc3) = " + pc1.identique(pc3));
		*/
	}
}