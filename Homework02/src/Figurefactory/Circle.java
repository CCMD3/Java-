package Figurefactory;

public class Circle implements Shape{
	public void init() {
		System.out.println("创建圆形");
	}
	@Override
	public void erase() {
		System.out.println("擦除圆形");
		
	}
	
}
