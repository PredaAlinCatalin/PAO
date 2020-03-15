package Scoala;

public class Catalog {
	
	private String grupa;
	private Student student[];
	Catalog(String grupa, Student st0, Student st1, Student st2, Student st3, Student st4)
	{
		this.grupa = grupa;
		this.student = new Student[5];
		this.student[0] = st0;
		this.student[1] = st1;
		this.student[2] = st2;
		this.student[3] = st3;
		this.student[4] = st4;
	}
	public String toString()
	{
		String result = "";
		for (int i = 0; i <= 4; i++)
			result += student[i].toString() + "\n";
		return result;
	}
	public double getMedieClasa()
	{
		return (student[0].getMedieAn1() + student[1].getMedieAn1() + student[2].getMedieAn1() + student[3].getMedieAn1() + student[4].getMedieAn1()) / 5;
	}
	public static void main(String []args)
	{
		Catalog catalog = new Catalog("244", new Student("A", 9, 9), new Student("B", 8, 10), new Student("C", 7, 5), new Student("D", 6, 7), new Student("E", 9, 9.5));
		System.out.println(catalog.getMedieClasa());
	}
}
