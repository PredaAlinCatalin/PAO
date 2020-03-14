package prob8;

public class Student {
	
	private String nume, prenume;
	public static int contor = 0;
	Student(String nume1, String prenume1)
	{
		contor++;
		nume = nume1;
		prenume = prenume1;
	}
	Student()
	{
		this("", "");
	}
	public void afisare()
	{
		System.out.println("Nume: " + nume + "; Prenume: " + prenume);
		
	}
	public static void main(String []args)
	{
		Student st1 = new Student("A", "a");
		Student st2 = new Student("B", "b");
		Student st3 = new Student("C", "c");
		Student st4 = new Student("D", "d");
		Student st5 = new Student("E", "e");
		Student st[] = new Student[5];
		st[0] = st1;
		st[1] = st2;
		st[2] = st3;
		st[3] = st4;
		st[4] = st5;
		for (int i = 0; i <= 4; i++)
			st[i].afisare();
		System.out.println(Student.contor);
	}
}
