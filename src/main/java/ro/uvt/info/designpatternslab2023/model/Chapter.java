package ro.uvt.info.designpatternslab2023.model;

import ro.uvt.info.designpatternslab2023.dao.Element;

import java.util.ArrayList;
import java.util.List;

public class Chapter{
    private String name;
    private List<Element> subChapters;

    public Chapter(String name) {
        this.name = name;
        this.subChapters = new ArrayList<>();
    }

    public int createSubChapter(String subChapterName) {
        SubChapter subChapter = new SubChapter(subChapterName);
        subChapters.add((Element) subChapter);
        return subChapters.indexOf(subChapter);
    }

    public SubChapter getSubChapter(int index) {
        if (index >= 0 && index < subChapters.size()) {
            return (SubChapter) subChapters.get(index);
        }
        return null;
    }

    public String getName() {
        return name;
    }

}




