package Lab3;

public class Coada {

	private int v[];
	private int last;
	Coada(int dim)
	{
		v = new int[dim];
		last = 0;
	}
	Coada()
	{
		this(100);
	}
	
	void push(int x)
	{
		if (last + 1 > v.length)
			System.out.println("Limita de spatiu depasita");
		else
		{
			v[last] = x;
			last++;
		}
	}
	int pop()
	{
		int []aux = new int[v.length];
		for (int i = 0; i < v.length ; i++)
			aux[i] = v[i];
		for (int i = 0; i < v.length - 1; i++)
			v[i] = aux[i + 1];
		last--;
		return aux[0];
	}
	boolean isEmpty()
	{
		if (last > 0)
			return false;
		return true;
	}
	public String toString()
	{
		String result = "";
		System.out.println(v.length + " ");
		result = v.length + " ";
		for (int i = 0; i < v.length; i++)
		{
			System.out.print(v[i] + " ");
			result += v[i] + " ";
		}
		System.out.println("");
		result += "\n";
		return result;
	}
	public static void main(String []args)
	{
		Coada c = new Coada(5);
		c.push(5);
		c.push(2);
		c.push(3);
		c.toString();
		c.pop();
		c.pop();
		c.toString();
		System.out.println(c.isEmpty());
		c.pop();
		c.toString();
		System.out.print(c.isEmpty());
		
	}
	
}
