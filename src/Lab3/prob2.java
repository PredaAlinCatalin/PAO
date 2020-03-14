package Lab3;

public class prob2 {
	public static void main(String []args)
	{
		int [][]a = new int[3][3];
		a[0][0] = 1;
		a[0][1] = 7;
		a[0][2] = 3;
		a[1][0] = 7;
		a[1][1] = 4;
		a[1][2] = -5;
		a[2][0] = 3;
		a[2][1] = -5;
		a[2][2] = 6;
		System.out.print(patratica(a));
	}
	static boolean patratica(int a[][])
	{
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++)
					if (a[i][j] != a[j][i])
						return false;
		return true;
	}
}
