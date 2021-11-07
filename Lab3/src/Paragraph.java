public class Paragraph implements Element {
	private String text;
	
	Paragraph(String paragraphText) {
		text = paragraphText;
	}
	
	public void print() {
		System.out.println("Paragraph: " + text);
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