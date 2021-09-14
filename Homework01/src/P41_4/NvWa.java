package P41_4;

public class NvWa {
	public static NvWaFactory getPerson(String people) {
		NvWaFactory person = null;
		if(people.equalsIgnoreCase("M")) {
			person = new Man();
		}else if(people.equalsIgnoreCase("W")) {
			person = new Woman();
		}else if(people.equalsIgnoreCase("R")) {
			person = new Robot();
		}
		return person;
	}

}
