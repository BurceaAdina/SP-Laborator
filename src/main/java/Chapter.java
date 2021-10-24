import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private Book book;
    private List<SubChapter> subChapters = new ArrayList<>();

    public Chapter() {

    }

    public Chapter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Book getBook() {
        return book;
    }

    public List<SubChapter> getSubChapters() {
        return subChapters;
    }

    public void setSubChapters(List<SubChapter> subChapters) {
        this.subChapters = subChapters;
    }

    public int createSubChapter(String element) {
        SubChapter subcapitol = new SubChapter(element);
        subChapters.add(subcapitol);
        return subChapters.indexOf(subcapitol);
    }

    public SubChapter getSubChapter(int indexSubChapterOneOne) {
        return subChapters.get(indexSubChapterOneOne);
    }
    public void print() {

    }
}