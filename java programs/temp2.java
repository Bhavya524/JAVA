// Java Program to illustrate constructor



class Geek {
	int num=5;
    int b=5;
	String name;
    int i;

	// This would be invoked while an object
	// of that class created.
	Geek()
	{
        i=num+b;
		System.out.println("Constructor called"+i);
	}
}

class temp2 {
	public static void main(String[] args)
	{
		// this would invoke default constructor.
		Geek geek1 = new Geek();

		// Default constructor provides the default
		// values to the object like 0, null
		System.out.println(geek1.i);
		System.out.println(geek1.num);
	}
}
