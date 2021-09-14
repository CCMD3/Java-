package Figurefactory;

public class Triangle implements Shape{
	public void init() {
		System.out.println("创建三角形");
	}
	@Override
	public void erase() {
		System.out.println("擦除三角形");
		
	}
	
}
