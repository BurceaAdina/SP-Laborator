import java.util.ArrayList;
import java.util.List;

public class Book {
	private String title;
	private List<Author> authors = new ArrayList<Author>();
	private List<Element> content = new ArrayList<Element>();
	
	Book(String bookTitle) {
		title = bookTitle;
	}
	
	public void addAuthor(Author author) {
		authors.add(author);
	}
	
	public int addContent(Element el) {
		content.add(el);
		return content.indexOf(el);
	}
	
	public void removeContent(Element el) {
		content.remove(el);
	}
	
	public Element getElement(int index) {
		if (index >= 0 && index < content.size()) {
			return content.get(index);
		}
		
		return null;
	}
	
	public void print() {
		System.out.println("Book: " + title);
		System.out.println();
		System.out.println("Authors: ");
		for (Author a : authors) {
			a.print();
		}
		System.out.println();
		for (Element el : content) {
			el.print();
		}
		
	}
}