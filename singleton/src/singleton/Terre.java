package singleton;

public class Terre {
	private static Terre terre;
	int population ;
	int age;
	private Terre()
	{
		int population= 40000000;
		int age= 80;
}
	public static Terre getInstance() {
		if (terre==null) {
			synchronized (Terre.class) {
				if (terre==null) {
			         terre= new Terre();
		      }
	       }
        }
		return terre ;
	}	
}
