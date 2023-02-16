package objectt;

import java.lang.reflect.Method;

public class GettClass {
public static void main(String[] args) {
	int count=0;
	Object o=new Integer(1007);
	Class c=o.getClass();
	System.out.println(c.getName());
	Method[] m=c.getDeclaredMethods();
	for(Method m1:m)
	{
		count++;
		System.out.println(m1.getName());
	}
	System.out.println(count);
}
}
