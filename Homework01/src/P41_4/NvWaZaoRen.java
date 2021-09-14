package P41_4;

public class NvWaZaoRen {
	public static void main(String[] args) {
		NvWaFactory person;
		person = NvWa.getPerson("M");	//男人
		person.abab();
		person = NvWa.getPerson("W");	//女人
		person.abab();
		person = NvWa.getPerson("R");	//机器人
		person.abab();
	}

}
