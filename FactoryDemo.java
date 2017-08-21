
public class FactoryDemo {

	public static void main(String[] args) {
		ShapeFactory factory = ShapeFactory.getInstance();
		
		Shape circle = factory.getShapeByType(ShapeType.CIRCLE);
		Shape rectangle = factory.getShapeByType(ShapeType.RECTANGLE);
		Shape square = factory.getShapeByType(ShapeType.SQUARE);
		
		circle.draw();
		rectangle.draw();
		square.draw();
		
	}
}
