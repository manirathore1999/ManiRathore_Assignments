package CoreJavaA2;

public class q1 {
	public static void main(String args[])
	{
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();

		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);
	}
}
class Singleton
{
	private static Singleton single_instance = null;
    public String s;
    private Singleton()
    {
        s = "Hello , My name is Mani Rathore";
    }
  
    // static method to create instance of Singleton class
    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();
  
        return single_instance;
    }
}