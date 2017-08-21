
public class ShapeFactory {
	
	private static final ShapeFactory FACTORY = new ShapeFactory();
	
	private ShapeFactory() {
		super();
	}
	
	public static ShapeFactory getInstance() {
		return FACTORY;
	}

	public Shape getShapeByType(String shapeType) {
		Shape shape = null;
		switch (shapeType) {
		case ShapeType.CIRCLE:
			shape = new Circle();
			break;
		case ShapeType.RECTANGLE:
			shape = new Rectangle();
			break;
		case ShapeType.SQUARE:
			shape = new Square();
			break;
		}
		return shape;
	}

}
