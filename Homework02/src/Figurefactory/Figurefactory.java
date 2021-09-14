package Figurefactory;
//才想起来可以用shape啊，为啥还要百度个“图形”的英文.....

public class Figurefactory {
	public static Shape getShape(String type) {
		Shape shape = null;
		if(type.equalsIgnoreCase("Triangle")) {
			shape = new Triangle();
			System.out.println("初始化三角形");
		}else if(type.equalsIgnoreCase("Circle")) {
			shape = new Circle();
			System.out.println("初始化圆形");
		}else if(type.equalsIgnoreCase("Rectangle")) {
			shape = new Rectangle();
			System.out.println("初始化正方形");
		}
		return shape;
	}
}
