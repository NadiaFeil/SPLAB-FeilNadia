package ro.uvt.info.designpatternslab2023.model;

import ro.uvt.info.designpatternslab2023.dao.Element;

public class TabelOfContents implements Element {
    private String text;

    public TabelOfContents(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println(text);
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
