package Figurefactory;

public class Text {
	public static void main(String[] args) {
		Shape shape;
		shape = Figurefactory.getShape("Circle");
		//��¼һ�δ��� ��һ������Բ��ʱ��ʾshape�ǿ�ֵ ��ѯ�����ڡ�circle��������һ���ո� 
		shape.init();
		shape.erase();
	}

}
