public class SetOfPerson {
	private Person[][] matrix = new Person[10][10];
	int count = 0;

	public boolean addPerson(Person person) {
		if (!contains(person)) {
			int hashcode = person.hashCode();
			int bucketIndex = hashcode % matrix.length;
			Person[] bucket = matrix[bucketIndex];
			for (int i = 0; i < bucket.length; i++) {
				if (bucket[i] == null) {
					bucket[i] = person;
					return true;
				}
			}
			Person[] temp = new Person[bucket.length + 5];
			System.arraycopy(bucket, 0, temp, 0, bucket.length);
			temp[bucket.length] = person;
			matrix[bucketIndex] = temp;
			return true;
		} else

		{
			return false;
		}
	}

	public boolean contains(Person person) {
		int hashcode = person.hashCode();
		int bucketIndex = hashcode % matrix.length;
		Person[] bucket = matrix[bucketIndex];
		for (int i = 0; i < bucket.length; i++) {
			if (bucket[i] != null && bucket[i].equals(person)) {
				return true;
			}
		}
		return false;

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				Person p = matrix[i][j];
				if (p != null) {
					sb.append(p).append(" ,");
				}
			}
		}
		sb.delete(sb.length() - 2, sb.length());
		sb.append("]");
		return sb.toString();
	}

}
