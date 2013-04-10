import java.util.ArrayList;
public class TreeTest
{
	public static void main(String [] args)
	{
		IntTreeBag bag1 = new IntTreeBag(50);
		IntTreeBag bag2 = new IntTreeBag(55);
		bag1.start();
		bag1.add(45);
		bag1.add(90);
		bag1.add(100);
		bag1.add(6);
		bag1.add(87);
		bag1.add(45);
		//bag1.add(88);
		bag1.print(8);
		
		System.out.println("---------bag2-------");
		
		bag2.add(40);
		bag2.add(95);
		bag2.add(1000);
		bag2.add(8);
		bag2.add(77);
		bag2.add(43);
		bag2.add(80);
		bag2.add(75);
		bag2.print(8);
		
		
	//	ArrayList<Integer> ir = IntTreeBag.getAlldata();
		//System.out.println(ir);
		int allData [] = bag1.getAllDatawihtArray();
		//System.out.println(bag1.getAllDatawihtArray());
		System.out.println("allData.length = " + allData.length);
		for(int i = 0; i < allData.length; i++)
		{
			//System.out.println("for - loop");
			System.out.printf("%d = %d\n",i,allData[i]);
		}
		System.out.printf("occurence of 0 = %d\n",bag1.countOccurrences(0));
		System.out.printf("occurence of 45 = %d\n",bag1.countOccurrences(45));
		System.out.printf("occurence of 100 = %d\n",bag1.countOccurrences(100));
		
		
		bag1.addAll(bag2);
		bag1.print(10);
		
		System.out.println("---union---");
		IntTreeBag.union(bag1, bag2).print(10);
		
		System.out.println("-----------iterate-----------");
		//bag1.print(10);
		bag1.start();
		while(bag1.isCurrent())
		{
			System.out.println("inside of loop");
			System.out.println(bag1.getCurrent().getData());
			bag1.advance();
		}
		
		
		//bag1.getAllDatawihtArray();
		/*for(int i = 0; i < 10; i++)
		{
			System.out.println(bag1.al.get(i));
		}
		*/
	}
}
