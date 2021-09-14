package Figurefactory;

public class Text {
	public static void main(String[] args) {
		Shape shape;
		shape = Figurefactory.getShape("Circle");
		//记录一次错误 第一次运行圆形时显示shape是空值 查询后发现在“circle”后多加了一个空格 
		shape.init();
		shape.erase();
	}

}
