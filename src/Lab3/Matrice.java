package Lab3;

public class Matrice {
	private int [][]a;
	private int nr_linii;
	private int nr_coloane;
	int set_elem(int i, int j, int x)
	{
		a[i][j] = x;
		return x;
	}
	int get_elem(int i, int j)
	{
		return a[i][j];
	}
	Matrice(int n, int m)
	{
		nr_linii = n;
		nr_coloane = m;
		a = new int[n][m];
	}
	Matrice add(Matrice m2)
	{
		Matrice sum = new Matrice(nr_linii, nr_coloane);
		for (int i = 0; i < nr_linii; i++)
			for (int j = 0; j < nr_coloane; j++)
				sum.a[i][j] = a[i][j] + m2.a[i][j];
		return sum;
	}
	Matrice multiply(Matrice m2)
	{
		if (nr_coloane != m2.nr_linii)
		{
			System.out.println("Dimensiunile celor 2 matrici nu se potrivesc");
			return m2;
		}
		else
		{
			Matrice mult = new Matrice(nr_linii, m2.nr_coloane);
			for (int i = 0; i < mult.nr_linii; i++)
				for (int j = 0; j < mult.nr_coloane; j++)
				{
					int s = 0;
					for (int k = 0; k < nr_coloane; k++)
						s += a[i][k] * m2.a[k][j];
					mult.a[i][j] = s;
				}
			return mult;
		}
	}
	Matrice pow(int power)
	{
		Matrice p = this;
		for (int i = 1; i < power; i++)
			p = p.multiply(p);
		return p;
	}
	void afisare()
	{
		System.out.println("");
		System.out.println("Numarul de linii: " + nr_linii);
		System.out.println("Numarul de coloane: " + nr_coloane);
		for (int i = 0; i < nr_linii; i++)
		{
			for (int j = 0; j < nr_coloane; j++)
				System.out.print(a[i][j] + " ");
			System.out.println("");
		}
		System.out.println("");
	}
	public static void main(String []args)
	{
		Matrice m1 = new Matrice(3, 3);
		Matrice m2 = new Matrice(3, 3);
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
			{
				m1.set_elem(i, j, 1);
				m2.set_elem(i, j, 2);
			}
		
		Matrice sum = m1.add(m2);
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
				System.out.print(sum.get_elem(i, j) + " ");
			System.out.println("");
		}
		System.out.println("");
		
		Matrice mult = m1.multiply(m2);
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
				System.out.print(mult.get_elem(i, j) + " ");
			System.out.println("");
		}
		System.out.println("");
		
		Matrice p = m1.pow(2);
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
				System.out.print(p.get_elem(i, j) + " ");
			System.out.println("");
		}
		p.afisare();
	}
}
