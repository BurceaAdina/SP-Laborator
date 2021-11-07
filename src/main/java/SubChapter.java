import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Element> content = new ArrayList<Element>();

    public SubChapter(String name) {
        this.name = name;
    }

    int void createNewParagraph(String element) {
        Paragraph p = Paragraph(element);
        content.add(p);
        return content.indexOf(p);
    }

    int void createNewImage(String element) {
        Image i = new Image(element);
        content.add(i);
        return content.indexOf(i);
    }

    public void createNewTable(String element) {
        Table t = new Table(element);
        content.add(t);
        return content.indexOf(t);
    }

    public void print() {
        System.out.println("Subchapter: " + name);
        for(Element e : content) {
            e.print();
        }

    }

}
