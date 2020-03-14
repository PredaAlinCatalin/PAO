package Lab3;

public class Complex 
{
	
	private double re, im;
	Complex(double a, double b)
	{
		re = a;
		im = b;
	}
	Complex()
	{
		this(0, 0);
	}
	public Complex suma(Complex a)
	{
		Complex s = new Complex();
		s.re = re + a.re;
		s.im = im + a.im;
		return s;
	}
	public String toString()
	{
		String result;
		if (im >= 0)
		{
			System.out.println(re + "+" + im + "i");
			result = re + "+" + im + "i";
		}
		else
		{
			System.out.println(re + "" + im + "i");
			result = re + "" + im + "i";
		}
		return result;

	}
	public boolean equals(Complex a)
	{
		if (a.re == re && a.im == im)
			return true;
		return false;
	}
	public static void main(String[] args)
	{
		Complex x = new Complex(5, -6);
		Complex y = new Complex();
		x.toString();
		y.toString();
		System.out.print(x.equals(y));
	}

}
