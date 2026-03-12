package singleton_pattern;

public class PrintSpooler {
	   private static PrintSpooler instance;

	   private PrintSpooler() {
	       init();
	   }

	   private void init() {
	       System.out.println("Initializing Print Spooler...");
	   
	   }

	 
	   public static PrintSpooler getInstance() {
	       if (instance == null) {
	           instance = new PrintSpooler();
	       }
	       return instance;
	   }


	   public void print(String document) {
	       System.out.println("Printing: " + document);
	   }
}
