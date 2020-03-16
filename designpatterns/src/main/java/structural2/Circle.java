package structural2;

public class Circle extends Shape {
	private int x, y, radius;

	   public Circle(int x, int y, int radius, Draw drawAPI) {
	      super(drawAPI);
	      this.x = x;  
	      this.y = y;  
	      this.radius = radius;
	   }

	   public String draw() {
	      String S=drawAPI.drawCircle(radius,x,y);
	      return S;
	   }

}
