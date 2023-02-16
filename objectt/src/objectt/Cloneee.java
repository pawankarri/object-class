package objectt;
public class Cloneee implements Cloneable
{
	int x=10;
	int y=20;
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Cloneee c1=new Cloneee();
		Cloneee c2=(Cloneee)c1.clone();
		c2.x=888;
		c2.y=999;
		System.out.println(c1.x+" "+c1.y);
		System.out.println(c2.x+" "+c2.y);
	}
}
