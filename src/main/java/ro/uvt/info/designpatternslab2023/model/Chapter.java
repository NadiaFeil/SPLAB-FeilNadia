package ro.uvt.info.designpatternslab2023.model;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapters;

    public Chapter(String name) {
        this.name = name;
        this.subChapters = new ArrayList<>();
    }

    public int createSubChapter(String subChapterName) {
        SubChapter subChapter = new SubChapter(subChapterName);
        subChapters.add(subChapter);
        return subChapters.indexOf(subChapter);
    }

    public SubChapter getSubChapter(int index) {
        if (index >= 0 && index < subChapters.size()) {
            return subChapters.get(index);
        }
        return null;
    }

    public String getName() {
        return name;
    }
}




