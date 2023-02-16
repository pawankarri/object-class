package objectt;

public class ToString {
String name;
int id;
public ToString(String name,int id)
{
	this.name=name;
	this.id=id;
}
/*public String toString()
{
	return name+" "+id;
}*/
public static void main(String[] args) {
	ToString t1=new ToString("pawan",1007);
	ToString t2=new ToString("xxxx",1000);
	System.out.println(t1);
	System.out.println(t2);
	
}
}
