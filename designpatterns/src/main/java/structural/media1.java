package structural;

public class media1 implements media {

	private String fileName;
    private String s="";

    public media1(String fileName){
       this.fileName = fileName;
       s=loadFromDisk(fileName);
    }
    public  String printName() {
       return s+"Displaying " + fileName;
    }

    private String loadFromDisk(String fileName){
       return "Loading " + fileName;
    }
}
