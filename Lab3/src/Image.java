public class Image implements Element {
	private String imageName;
	
	Image(String name) {
		imageName = name;
	}
	
	public void print() {
		System.out.println("Image with name:" + imageName);
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