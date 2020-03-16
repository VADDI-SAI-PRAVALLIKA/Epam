package creational;

public class main {
	public  String main()
    {
        single singletonClass = single.getInstance();
        return singletonClass.showMessage();
    }

}
