package Prob7;

public class Produs
{
	private String nume;
	private double pret;
	private int cantitate;
	Produs(String nume1, double pret1, int cantitate1)
	{
		nume = nume1;
		pret = pret1;
		cantitate = cantitate1;
	}
	Produs()
	{
		this("", 0, 0);
	}
	public String toString()
	{
		String result =  "Produs: " + nume + "; pret: " + pret + "; cantitate: " + cantitate + "\n";
		return result;
	}
	public double getTotalProdus()
	{
		double result = cantitate * pret;
		return result;
	}
	

}
