package CharacterGraphics;

public class Main {
	public static void main(String[] args) {
		
		Triangle t=new Triangle(10,5);
		t.drawHere();
		t.drawAt(5);
		
		Rectangle r=new Rectangle(10, 5, 5);
		r.drawHere();
		
	}

}
