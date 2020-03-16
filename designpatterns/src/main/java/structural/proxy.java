package structural;

public class proxy implements media{

	private media1 mediaFileImpl;
	   private String fileName;

	   public proxy(String fileName){
	      this.fileName = fileName;
	   }

	   public String printName() {
	      if(mediaFileImpl == null){
	         mediaFileImpl = new media1(fileName);
	      }
	      return mediaFileImpl.printName();
	   }
}
