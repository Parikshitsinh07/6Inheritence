//5 Demonstration of Varianle hidding
class G
{
	static int x = 100;
}
class H extends G
{
	int x = 50;
	void display()
	{
		System.out.println("x = " + x);
		System.out.println("super.x = " + super.x);
	}
}
class Gh{
	public static void main(String [] agrs)
	{
		H h = new H();
		h.display();
	}
}