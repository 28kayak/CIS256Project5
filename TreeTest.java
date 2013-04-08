
public class TreeTest
{
	public static void main(String [] args)
	{
		IntTreeBag bag1 = new IntTreeBag(50);
		bag1.add(45);
		bag1.add(90);
		bag1.print(4);
		bag1.traverse(bag1);
		for(int i = 0; i < 10; i++)
		{
			System.out.println(bag1.al.get(i));
		}
	}
}
