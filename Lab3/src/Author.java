public class Author {
	private String name;
	private String surname;
	
	Author(String authorName, String authorSurname) {
		name = authorName;
		surname = authorSurname;
	}
	public void print() {
		System.out.println("Author: " + name + surname);
	}
}