package Figurefactory;

public class Rectangle implements Shape{
	public void init() {
		System.out.println("创建正方形");
	}
	@Override
	public void erase() {
		System.out.println("擦除正方形");
		
	}
	
}
