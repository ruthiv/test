package b;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Dictionary {
	Map<String, String> dictionary = new LinkedHashMap<>();

	public void addEntry(String str1, String str2) {
		dictionary.put(str1, str2);
	}

	public String getDefinition(String str1) {
		return dictionary.get(str1);
	}

	public void editEntry(String str1, String str2) {
		dictionary.put(str1, str2);

	}

	public String deleteEntry(String str1) {
		dictionary.remove(str1);
		return "null";
	}

	public Set<String> getAllEntriSorted() {
		Collection<String> words = new LinkedHashSet<>();
		words = (Collection<String>) dictionary.values();
		Set<String> word = new LinkedHashSet<>();
		word = (Set<String>) words;
		return word;
	}
}
