package learnjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class AddShape {
	
	public static void drawAll(List<? extends Shape> shapes){
		
		for (Shape s:shapes) {
			s.draw();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rectangle = new Rectangle();
		Shape radius = new Radius();
		List<Shape> shapList = new ArrayList<Shape>();
		shapList.add(rectangle);
		shapList.add(radius);
		AddShape.drawAll(shapList);
		
	}
}
