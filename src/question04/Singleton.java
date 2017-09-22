package question04;

public class Singleton {
	   private Singleton(){
	       System.out.println("Eager initialization. Instance is initialized when class is loaded");
	   };
	   private static Singleton instance = new Singleton();
	   public static Singleton getInstance(){
	       return instance;
	   }
	}

