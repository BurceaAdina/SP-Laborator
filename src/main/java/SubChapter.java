import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<String> images = new ArrayList<>();
    private List<String> paragraphs = new ArrayList<>();
    private List<String> tables = new ArrayList<>();
    private Chapter chapter;

    public SubChapter() {

    }

    public SubChapter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void createNewParagraph(String element) {
        paragraphs.add(element);
    }

    public void createNewImage(String element) {
        images.add(element);
    }

    public void createNewTable(String element) {
        tables.add(element);
    }

    public void print() {
        System.out.println("Subchapter: " + getName());
        paragraphs.forEach(i -> System.out.println("Paragraph: "+ i));
        images.forEach(i -> System.out.println("Image with name: " + i));
        tables.forEach(i -> System.out.println("Table with Title: " + i));

    }

}