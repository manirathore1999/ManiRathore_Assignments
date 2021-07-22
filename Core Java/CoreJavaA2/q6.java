package CoreJavaA2;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistence p=new FilePersistence();
	     p.persist();
	     
	     Persistence p1=new DatabasePersistence();
	     p1.persist();
	}

}

abstract class Persistence
{
	abstract void persist();
}

class FilePersistence extends Persistence
{
	void persist() {
	System.out.println("This is the persist method of FilePersistence class");	
	}	
}

class DatabasePersistence extends Persistence
{
	void persist() {
	System.out.println("This is the persist method of DatabasePersistence class");	
	}
}
