package objectt;

public class Hashcodee {
	int i;
	public Hashcodee(int i)
	{
		this.i=i;
	}
	/*public String toString()
	{
		return i+"";
	}
	public int hashCode()
	{
		return i;
	}*/
public static void main(String[] args) {
	Hashcodee h1=new Hashcodee(10);
	Hashcodee h2=new Hashcodee(100);
	System.out.println(h1);
	System.out.println(h2);
}
}
