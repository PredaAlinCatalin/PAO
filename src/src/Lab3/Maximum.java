package Lab3;

public class Maximum {

	private int nr;
	
	Maximum()
	{
		
	}
	Maximum(int a)
	{
		nr = a;
	}
	public int maxim(int a)
	{
		if (nr > a)
			return nr;
		else
			return a;
	}
	public int maxim(int a, int b)
	{
		Maximum aux = new Maximum(b);
		return aux.maxim(maxim(a));
	}
	public int maxim(int a, int b, int c)
	{
		Maximum aux1 = new Maximum(b);
		Maximum aux2 = new Maximum(aux1.maxim(maxim(a)));
		return aux2.maxim(c);
	}
	public int maxim(int a, int b, int c, int d)
	{
		Maximum aux1 = new Maximum(b);
		Maximum aux2 = new Maximum(aux1.maxim(maxim(a)));
		Maximum aux3 = new Maximum(aux2.maxim(c));
		return aux3.maxim(d);
	}
	public static void main(String[] args) {
		Maximum x = new Maximum(8);
		System.out.println(x.maxim(6, 10));
		System.out.println(x.maxim(6, 10, 12));
		System.out.println(x.maxim(6, 10, 12, 13));
		
	}

}
