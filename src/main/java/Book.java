import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    TableOfContents tableofcontents;
    private List<Author> authors = new ArrayList<>();
    private List<Chapter> chapters = new ArrayList<>();

    public Book(String title) {
        this.title = title;
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
        System.out.println("Book: " + title);
		System.out.println();
		System.out.println("Authors: ");
		for (Author a : authors) {
			a.print();
		}
		System.out.println();
		for (Chapter chapter : chapters) {
			chapter.print();
		}

    }
}
