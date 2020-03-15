package geometry;

import java.lang.*;
public class Punct 
{
	private int x, y;
	Punct(int a, int b)
	{
		x = a;
		y = b;
	}
	Punct()
	{
		this(0, 0);
	}
	public int getX()
	{
		return x;
	}
	public void setX(int a)
	{
		x = a;
	}
	public int getY()
	{
		return y;
	}
	public void setY(int b)
	{
		y = b;
	}
	public String toString()
	{
		String result = "(" + x + "," + y + ")";
		return result;
	}
	public double distance(int a, int b)
	{
		double result = Math.sqrt((a - x) * (a - x) + (b - y) * (b - y));
		return result;
	}
	public double distance(Punct p1)
	{
		double result = Math.sqrt((p1.x - x) * (p1.x - x) + (p1.y - y) * (p1.y - y));
		return result;
	}
}
