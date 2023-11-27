package ro.uvt.info.designpatternslab2023.model;

import ro.uvt.info.designpatternslab2023.dao.Element;

import java.util.ArrayList;
import java.util.List;

public class SubChapter implements Element {
    private String name;
    private List<Object> content;

    public SubChapter(String name) {
        this.name = name;
        this.content = new ArrayList<>();
    }

    public void createNewParagraph(String text) {
        content.add(new Paragraph(text));
    }

    public void createNewImage(String imageName) {
        content.add(new Image(imageName));
    }

    public void createNewTable(String tableTitle) {
        Table table = new Table(tableTitle);
        content.add(table);
    }

    @Override
    public void print() {
        System.out.println("SubChapter: " + name);
    }

    @Override
    public void addElement(Element element) {

    }

    @Override
    public void removeElement(Element element) {

    }

    @Override
    public Element get(int number) {
        return null;
    }
}



