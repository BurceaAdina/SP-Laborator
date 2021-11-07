public class TableOfContents implements Element {

	private String title;
	
	TableOfContents(String tableTitle) {
		title = tableTitle;
	}
	
	public void print() {
		System.out.println("Table with Title: " + title);
	}
	
	public int add(Element elem) throws Exception {
		throw new Exception();
	}

	public void remove(Element elem) throws Exception {
		throw new Exception();
		
	}

	public Element getElement(int index) throws Exception {
		throw new Exception();
	}
}