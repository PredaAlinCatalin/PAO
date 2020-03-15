package Scoala;

public class Student {
	private String nume;
	private double medieSem1, medieSem2;
	Student(String nume, double medieSem1, double medieSem2)
	{
		this.nume = nume;
		this.medieSem1 = medieSem1;
		this.medieSem2 = medieSem2;
	}
	Student()
	{
		this("", 0, 0);
	}
	public String toString()
	{
		String result = "Nume: " + nume + "; Medie semestrul 1: " + medieSem1 + "; Medie semestrul 2: " + medieSem2;
		System.out.println("Nume: " + nume + "; Medie semestrul 1: " + medieSem1 + "; Medie semestrul 2: " + medieSem2);
		return result;
	}
	double getMedieAn1()
	{
		return (medieSem1 + medieSem2) / 2;
	}
	
}
