package P41_4;

public class NvWaZaoRen {
	public static void main(String[] args) {
		NvWaFactory person;
		person = NvWa.getPerson("M");	//����
		person.abab();
		person = NvWa.getPerson("W");	//Ů��
		person.abab();
		person = NvWa.getPerson("R");	//������
		person.abab();
	}

}
