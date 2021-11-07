import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapters = new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }


    public List<SubChapter> getSubChapters() {
        return subChapters;
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
        System.out.println("Chapter " + name);
		for (SubChapter sc : subChapters) {
			sc.print();
		}

    }
}
