package Figurefactory;
//��������������shape����Ϊɶ��Ҫ�ٶȸ���ͼ�Ρ���Ӣ��.....

public class Figurefactory {
	public static Shape getShape(String type) {
		Shape shape = null;
		if(type.equalsIgnoreCase("Triangle")) {
			shape = new Triangle();
			System.out.println("��ʼ��������");
		}else if(type.equalsIgnoreCase("Circle")) {
			shape = new Circle();
			System.out.println("��ʼ��Բ��");
		}else if(type.equalsIgnoreCase("Rectangle")) {
			shape = new Rectangle();
			System.out.println("��ʼ��������");
		}
		return shape;
	}
}
