package objectt;

public class Equalss {
String name;
int id;
public Equalss(String name,int id)
{
	this.name=name;
	this.id=id;
}
public boolean equals(Object o)
{
	Equalss e=(Equalss)o;
	if(name.equals(e.name)&&id==e.id)
	{
		return true;
	}
	else
	{
		return false;
	}
}
public static void main(String[] args) {
	Equalss e1=new Equalss("pawan",1007);
	Equalss e2=new Equalss("xxxx",1000);
	Equalss e3=new Equalss("pawan",1007);
	Equalss e4=e1;
	System.out.println(e1.equals(e2));
	System.out.println(e1.equals(e3));
	System.out.println(e1.equals(e4));
}
}
