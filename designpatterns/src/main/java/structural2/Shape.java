package structural2;

public abstract class Shape {

	protected Draw drawAPI;
	   
	   protected Shape(Draw drawAPI){
	      this.drawAPI = drawAPI;
	   }
	   public abstract String draw();
}
