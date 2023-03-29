package b;

public class DictionaryMainApp {

	public static void main(String[] args) {
		Dictionary d = new Dictionary();
		d.addEntry("dd", "jjj");
		System.out.println(d.getDefinition("dd"));
		d.addEntry("dj", "mnhih");
		d.editEntry("dd", "kkj");
		System.out.println(d.getDefinition("dd"));
		// System.out.println(d.getAllEntriSorted());
	}

}
