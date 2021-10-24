import java.util.ArrayList;
import java.util.List;
//import java.util.Collection;

public class Book {
    private String title;
    TableOfContents tableofcontents;
    private List<Author> authors = new ArrayList<>();
    private List<Chapter> chapters = new ArrayList<>();
    //private Collection<Author> authors;
    //private Collection<Chapter> chapters = new Collection();
    public Book() {

    }

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public int createChapter(String chapter) {
        Chapter capitol = new Chapter(chapter);
        chapters.add(capitol);
        return chapters.indexOf(capitol);
    }

    public Chapter getChapter(int index) {
        return chapters.get(index);
    }

    public void print() {

    }
}