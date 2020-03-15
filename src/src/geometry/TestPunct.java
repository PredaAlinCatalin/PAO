package geometry;

public class TestPunct 
{
	public static void main(String []args)
	{
		Punct A = new Punct(1, 3);
		Punct B = new Punct(-1, 2);
		System.out.print(A.distance(B));
		// Q: Puteti accesa datele clasei Punct in metoda main din clasa TestPunct?
		// A: Nu, deoarece sunt .private
	}
}
