package Prob7;

public class Magazin
{
	private String nume;
	private Produs produse[];
	Magazin(String nume1, Produs a, Produs b, Produs c)
	{
		nume = nume1;
		produse = new Produs[3];
		produse[0] = a;
		produse[1] = b;
		produse[2] = c;
	}
	Magazin()
	{
		nume = "";
		produse = new Produs[3];
	}
	public String toString()
	{
		String result = "";
		for (int i = 0; i < 3; i++)
			result += produse[i].toString();
		System.out.print(result);
		return result;
	}
	public double getTotalMagazin()
	{
		double result = 0;
		for (int i = 0; i < 3; i++)
			result += produse[i].getTotalProdus();
		return result;
	}
	public static void main(String []args)
	{
		Magazin magazin = new Magazin("Mag", new Produs("a", 50, 1), new Produs("b", 100, 2), new Produs("c", 150, 4));
		magazin.toString();
		System.out.println(magazin.getTotalMagazin());
		
	}
}
