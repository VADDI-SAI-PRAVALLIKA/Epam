package creational;

public class single {
	private static single instance = new single();
	   
    public single() {}
    
    public static single getInstance() {
        return instance;
    }
    
    public String showMessage() {
        return "I'm a singleton object!" ;   
    }

}
